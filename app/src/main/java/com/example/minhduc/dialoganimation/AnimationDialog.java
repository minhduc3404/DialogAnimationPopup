package com.example.minhduc.dialoganimation;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class AnimationDialog extends DialogFragment {


    @Override
    public int getTheme() {
        return R.style.FullScreenDialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.animtion_dialog, container, false);
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        //getDialog().getWindow().setWindowAnimations(R.style.AnimationUpDownDialog);

    }
}
