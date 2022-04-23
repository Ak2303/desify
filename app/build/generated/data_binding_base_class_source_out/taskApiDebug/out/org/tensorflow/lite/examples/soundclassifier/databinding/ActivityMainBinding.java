// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.soundclassifier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.slider.Slider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.soundclassifier.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Slider classificationIntervalSlider;

  @NonNull
  public final View dividerView;

  @NonNull
  public final SwitchMaterial inputSwitch;

  @NonNull
  public final TextView overlapFactorTextView;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Slider classificationIntervalSlider, @NonNull View dividerView,
      @NonNull SwitchMaterial inputSwitch, @NonNull TextView overlapFactorTextView,
      @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.classificationIntervalSlider = classificationIntervalSlider;
    this.dividerView = dividerView;
    this.inputSwitch = inputSwitch;
    this.overlapFactorTextView = overlapFactorTextView;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.classification_interval_slider;
      Slider classificationIntervalSlider = ViewBindings.findChildViewById(rootView, id);
      if (classificationIntervalSlider == null) {
        break missingId;
      }

      id = R.id.divider_view;
      View dividerView = ViewBindings.findChildViewById(rootView, id);
      if (dividerView == null) {
        break missingId;
      }

      id = R.id.input_switch;
      SwitchMaterial inputSwitch = ViewBindings.findChildViewById(rootView, id);
      if (inputSwitch == null) {
        break missingId;
      }

      id = R.id.overlap_factor_text_view;
      TextView overlapFactorTextView = ViewBindings.findChildViewById(rootView, id);
      if (overlapFactorTextView == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, classificationIntervalSlider,
          dividerView, inputSwitch, overlapFactorTextView, recyclerView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
