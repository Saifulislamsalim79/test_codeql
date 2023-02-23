package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Guideline;
import com.gmail.samehadar.iosdialog.CamomileSpinner;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentFaceVerificationBinding implements InterfaceC8209a {
    public final AppCompatImageButton cancelButton;
    public final ImageView capturedImageView;
    public final AppCompatImageButton continueButton;
    public final TextView errorTextView;
    public final TextView faceDoesNotMatchView;
    public final Guideline midHorizontalGuideline;
    public final FrameLayout preview;
    public final ProgressBar progressBar;
    private final ScrollView rootView;
    public final TextView stepDescription;
    public final CamomileSpinner stepGifIcon;
    public final ImageView stepIcon;
    public final TextView stepText;
    public final ImageView toggleFacing;
    public final KudiButton verifyWithBvnView;

    private FragmentFaceVerificationBinding(ScrollView scrollView, AppCompatImageButton appCompatImageButton, ImageView imageView, AppCompatImageButton appCompatImageButton2, TextView textView, TextView textView2, Guideline guideline, FrameLayout frameLayout, ProgressBar progressBar, TextView textView3, CamomileSpinner camomileSpinner, ImageView imageView2, TextView textView4, ImageView imageView3, KudiButton kudiButton) {
        this.rootView = scrollView;
        this.cancelButton = appCompatImageButton;
        this.capturedImageView = imageView;
        this.continueButton = appCompatImageButton2;
        this.errorTextView = textView;
        this.faceDoesNotMatchView = textView2;
        this.midHorizontalGuideline = guideline;
        this.preview = frameLayout;
        this.progressBar = progressBar;
        this.stepDescription = textView3;
        this.stepGifIcon = camomileSpinner;
        this.stepIcon = imageView2;
        this.stepText = textView4;
        this.toggleFacing = imageView3;
        this.verifyWithBvnView = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFaceVerificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancel_button;
        View $r1 = view.findViewById(C0001R.C0003id.cancel_button);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) $r1;
        if (appCompatImageButton != null) {
            $i0 = C0001R.C0003id.captured_image_view;
            View $r12 = view.findViewById(C0001R.C0003id.captured_image_view);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.continue_button;
                View $r13 = view.findViewById(C0001R.C0003id.continue_button);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) $r13;
                if (appCompatImageButton2 != null) {
                    $i0 = C0001R.C0003id.error_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.error_text_view);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.face_does_not_match_view;
                        View $r15 = view.findViewById(C0001R.C0003id.face_does_not_match_view);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.midHorizontalGuideline;
                            View $r16 = view.findViewById(C0001R.C0003id.midHorizontalGuideline);
                            Guideline guideline = (Guideline) $r16;
                            if (guideline != null) {
                                $i0 = C0001R.C0003id.preview;
                                View $r17 = view.findViewById(C0001R.C0003id.preview);
                                FrameLayout $r8 = (FrameLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.progressBar;
                                    View $r18 = view.findViewById(C0001R.C0003id.progressBar);
                                    ProgressBar $r9 = (ProgressBar) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.step_description;
                                        View $r19 = view.findViewById(C0001R.C0003id.step_description);
                                        TextView $r10 = (TextView) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.stepGifIcon;
                                            View $r110 = view.findViewById(C0001R.C0003id.stepGifIcon);
                                            CamomileSpinner $r11 = (CamomileSpinner) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.stepIcon;
                                                View $r111 = view.findViewById(C0001R.C0003id.stepIcon);
                                                ImageView $r122 = (ImageView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.step_text;
                                                    View $r112 = view.findViewById(C0001R.C0003id.step_text);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.toggle_facing;
                                                        View $r113 = view.findViewById(C0001R.C0003id.toggle_facing);
                                                        ImageView $r142 = (ImageView) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.verify_with_bvn_view;
                                                            View $r114 = view.findViewById(C0001R.C0003id.verify_with_bvn_view);
                                                            KudiButton $r152 = (KudiButton) $r114;
                                                            if ($r152 != null) {
                                                                ScrollView $r172 = (ScrollView) view;
                                                                FragmentFaceVerificationBinding $r162 = new FragmentFaceVerificationBinding($r172, appCompatImageButton, imageView, appCompatImageButton2, textView, textView2, guideline, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152);
                                                                return $r162;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r182 = view.getResources();
        String $r192 = $r182.getResourceName($i0);
        NullPointerException $r20 = new NullPointerException("Missing required view with ID: ".concat($r192));
        throw $r20;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFaceVerificationBinding inflate(LayoutInflater layoutInflater) {
        FragmentFaceVerificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentFaceVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_face_verification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentFaceVerificationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
