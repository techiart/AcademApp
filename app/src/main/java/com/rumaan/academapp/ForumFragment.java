package com.rumaan.academapp;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rumaan.academapp.databinding.FragmentForumBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForumFragment extends Fragment {

    private FragmentForumBinding fragmentForumBinding;

    public ForumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return FragmentForumBinding.inflate(inflater, container, false).getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentForumBinding = DataBindingUtil.getBinding(view);
        fragmentForumBinding.testText.setTypeface(CustomFont.getInstance(getContext()).getTypeFace(CustomFont.Regular));
    }
}