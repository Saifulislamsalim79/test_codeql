package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewPictureUploadBinding implements InterfaceC8209a {
    public final Guideline guideline5;
    public final Guideline guideline6;
    public final TextView profileHeaderTextView;
    private final ConstraintLayout rootView;
    public final ImageView takePictureImageView;
    public final TextView takePictureTextView;
    public final ImageView uploadPictureImageView;
    public final TextView uploadPictureTextView;

    private ViewPictureUploadBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.guideline5 = guideline;
        this.guideline6 = guideline2;
        this.profileHeaderTextView = textView;
        this.takePictureImageView = imageView;
        this.takePictureTextView = textView2;
        this.uploadPictureImageView = imageView2;
        this.uploadPictureTextView = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadBinding bind(View view) {
        int $i0 = C0001R.C0003id.guideline5;
        View $r1 = view.findViewById(C0001R.C0003id.guideline5);
        Guideline $r2 = (Guideline) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.guideline6;
            View $r12 = view.findViewById(C0001R.C0003id.guideline6);
            Guideline $r3 = (Guideline) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.profileHeaderTextView;
                View $r13 = view.findViewById(C0001R.C0003id.profileHeaderTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.takePictureImageView;
                    View $r14 = view.findViewById(C0001R.C0003id.takePictureImageView);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.takePictureTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.takePictureTextView);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.uploadPictureImageView;
                            View $r16 = view.findViewById(C0001R.C0003id.uploadPictureImageView);
                            ImageView imageView2 = (ImageView) $r16;
                            if (imageView2 != null) {
                                $i0 = C0001R.C0003id.uploadPictureTextView;
                                View $r17 = view.findViewById(C0001R.C0003id.uploadPictureTextView);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    ViewPictureUploadBinding $r9 = new ViewPictureUploadBinding($r10, $r2, $r3, textView, imageView, textView2, imageView2, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadBinding inflate(LayoutInflater layoutInflater) {
        ViewPictureUploadBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_picture_upload, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewPictureUploadBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
