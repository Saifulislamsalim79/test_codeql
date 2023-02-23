package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.picture_picker.custom.AutoFitTextureView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPicturePickerBinding implements InterfaceC8209a {
    public final AutoFitTextureView cameraView;
    public final ConstraintLayout clCameraState;
    public final ConstraintLayout clPreviewState;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout constraintLayout3;
    public final FrameLayout flCameraView;
    public final FrameLayout flCancel;
    public final FrameLayout flCapture;
    public final FrameLayout flGallery;
    public final FrameLayout flRotateCamera;
    public final ImageView ivFocusFrame;
    public final ImageView ivSelectedImage;
    private final FrameLayout rootView;
    public final TextView tvPrompt;

    private FragmentPicturePickerBinding(FrameLayout frameLayout, AutoFitTextureView autoFitTextureView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = frameLayout;
        this.cameraView = autoFitTextureView;
        this.clCameraState = constraintLayout;
        this.clPreviewState = constraintLayout2;
        this.constraintLayout = constraintLayout3;
        this.constraintLayout3 = constraintLayout4;
        this.flCameraView = frameLayout2;
        this.flCancel = frameLayout3;
        this.flCapture = frameLayout4;
        this.flGallery = frameLayout5;
        this.flRotateCamera = frameLayout6;
        this.ivFocusFrame = imageView;
        this.ivSelectedImage = imageView2;
        this.tvPrompt = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPicturePickerBinding bind(View view) {
        View $r1 = view.findViewById(C0038R.C0040id.camera_view);
        AutoFitTextureView autoFitTextureView = (AutoFitTextureView) $r1;
        int $i0 = C0038R.C0040id.cl_camera_state;
        View $r12 = view.findViewById($i0);
        ConstraintLayout constraintLayout = (ConstraintLayout) $r12;
        if (constraintLayout != null) {
            $i0 = C0038R.C0040id.cl_preview_state;
            View $r13 = view.findViewById($i0);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) $r13;
            if (constraintLayout2 != null) {
                View $r14 = view.findViewById(C0038R.C0040id.constraintLayout);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) $r14;
                View $r15 = view.findViewById(C0038R.C0040id.constraintLayout3);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) $r15;
                View $r16 = view.findViewById(C0038R.C0040id.fl_camera_view);
                FrameLayout frameLayout = (FrameLayout) $r16;
                $i0 = C0038R.C0040id.fl_cancel;
                View $r17 = view.findViewById($i0);
                FrameLayout $r8 = (FrameLayout) $r17;
                if ($r8 != null) {
                    $i0 = C0038R.C0040id.fl_capture;
                    View $r18 = view.findViewById($i0);
                    FrameLayout $r9 = (FrameLayout) $r18;
                    if ($r9 != null) {
                        $i0 = C0038R.C0040id.fl_gallery;
                        View $r19 = view.findViewById($i0);
                        FrameLayout $r10 = (FrameLayout) $r19;
                        if ($r10 != null) {
                            $i0 = C0038R.C0040id.fl_rotate_camera;
                            View $r110 = view.findViewById($i0);
                            FrameLayout $r11 = (FrameLayout) $r110;
                            if ($r11 != null) {
                                $i0 = C0038R.C0040id.iv_focus_frame;
                                View $r111 = view.findViewById($i0);
                                ImageView $r122 = (ImageView) $r111;
                                if ($r122 != null) {
                                    $i0 = C0038R.C0040id.iv_selected_image;
                                    View $r112 = view.findViewById($i0);
                                    ImageView $r132 = (ImageView) $r112;
                                    if ($r132 != null) {
                                        $i0 = C0038R.C0040id.tv_prompt;
                                        View $r113 = view.findViewById($i0);
                                        TextView $r142 = (TextView) $r113;
                                        if ($r142 != null) {
                                            FrameLayout $r162 = (FrameLayout) view;
                                            FragmentPicturePickerBinding $r152 = new FragmentPicturePickerBinding($r162, autoFitTextureView, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, frameLayout, $r8, $r9, $r10, $r11, $r122, $r132, $r142);
                                            return $r152;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r172 = view.getResources();
        String $r182 = $r172.getResourceName($i0);
        NullPointerException $r192 = new NullPointerException("Missing required view with ID: ".concat($r182));
        throw $r192;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPicturePickerBinding inflate(LayoutInflater layoutInflater) {
        FragmentPicturePickerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPicturePickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.fragment_picture_picker;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPicturePickerBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
