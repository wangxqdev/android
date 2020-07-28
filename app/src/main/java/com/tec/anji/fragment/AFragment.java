package com.tec.anji.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.tec.anji.R;

import java.util.Objects;

public class AFragment extends Fragment {

    private BFragment bFragment;

    private IMessage iMessage;

    /**
     * 传参并实例化
     *
     * @param title
     * @return
     */
    public static AFragment newInstance(String title) {
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        aFragment.setArguments(bundle);
        return aFragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.iMessage = (IMessage) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(getClass().getSimpleName(), "---- onCreateView ----");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnMessage = view.findViewById(R.id.btn_message);
        Button btnChangeB = view.findViewById(R.id.btn_change_b);
        Button btnChangeTv = view.findViewById(R.id.btn_change_tv);
        TextView textView = view.findViewById(R.id.tv_frag_a);

        btnMessage.setOnClickListener(v -> iMessage.onChange("我是新人类"));

        btnChangeB.setOnClickListener(v -> {
            if (null == bFragment) {
                bFragment = new BFragment();
            }
            Fragment aFragment = Objects.requireNonNull(getFragmentManager()).findFragmentByTag("a");
            if (null != aFragment) {
                getFragmentManager().beginTransaction()
                        .hide(aFragment)
                        .add(R.id.fl_frag_change, bFragment)
                        .addToBackStack(null)
                        .commitAllowingStateLoss();
            } else {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fl_frag_change, bFragment)
                        .addToBackStack(null)
                        .commitAllowingStateLoss();
            }
        });

        btnChangeTv.setOnClickListener(v -> textView.setText("我是新人类"));

        Bundle bundle = getArguments();
        if (null != bundle) {
            textView.setText(bundle.getString("title"));
        }
    }

    interface IMessage {

        void onChange(String text);
    }
}
