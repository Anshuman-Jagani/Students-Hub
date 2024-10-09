package com.example.students_hub.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Students Hub! We are Devanshu Parmar and Anshuman Jagani, currently in the 5th semester of the IT Department at Dharmsinh Desai College. Students Hub is our app development project, created with the aim of helping all IT students in our college stay organized.\n" +
        "\n" +
                "Our app provides easy access to previous year's question papers, syllabus, study materials, and faculty information, all in one place. We hope Students Hub becomes a valuable resource for your academic journey!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}