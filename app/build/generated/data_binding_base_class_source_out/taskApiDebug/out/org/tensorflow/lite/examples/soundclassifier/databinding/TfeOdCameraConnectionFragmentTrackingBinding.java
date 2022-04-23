// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.soundclassifier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.detection.customview.AutoFitTextureView;
import org.tensorflow.lite.examples.detection.customview.OverlayView;
import org.tensorflow.lite.examples.soundclassifier.R;

public final class TfeOdCameraConnectionFragmentTrackingBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AutoFitTextureView texture;

  @NonNull
  public final OverlayView trackingOverlay;

  private TfeOdCameraConnectionFragmentTrackingBinding(@NonNull FrameLayout rootView,
      @NonNull AutoFitTextureView texture, @NonNull OverlayView trackingOverlay) {
    this.rootView = rootView;
    this.texture = texture;
    this.trackingOverlay = trackingOverlay;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TfeOdCameraConnectionFragmentTrackingBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TfeOdCameraConnectionFragmentTrackingBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tfe_od_camera_connection_fragment_tracking, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TfeOdCameraConnectionFragmentTrackingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.texture;
      AutoFitTextureView texture = ViewBindings.findChildViewById(rootView, id);
      if (texture == null) {
        break missingId;
      }

      id = R.id.tracking_overlay;
      OverlayView trackingOverlay = ViewBindings.findChildViewById(rootView, id);
      if (trackingOverlay == null) {
        break missingId;
      }

      return new TfeOdCameraConnectionFragmentTrackingBinding((FrameLayout) rootView, texture,
          trackingOverlay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
