package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewPictureUploadFragmentBinding implements InterfaceC8209a {
    public final Button actionButton;
    public final TextView descriptionTextView;
    public final Guideline guideline4;
    public final CircleImageView profilePictureImageView;
    private final ConstraintLayout rootView;
    public final TextView uploadProgressTextView;
    public final ProgressBar uploadingProgressBar;

    private ViewPictureUploadFragmentBinding(ConstraintLayout constraintLayout, Button button, TextView textView, Guideline guideline, CircleImageView circleImageView, TextView textView2, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.actionButton = button;
        this.descriptionTextView = textView;
        this.guideline4 = guideline;
        this.profilePictureImageView = circleImageView;
        this.uploadProgressTextView = textView2;
        this.uploadingProgressBar = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.actionButton;
        View $r1 = view.findViewById(C0001R.C0003id.actionButton);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.descriptionTextView;
            View $r12 = view.findViewById(C0001R.C0003id.descriptionTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.guideline4;
                View $r13 = view.findViewById(C0001R.C0003id.guideline4);
                Guideline guideline = (Guideline) $r13;
                if (guideline != null) {
                    $i0 = C0001R.C0003id.profilePictureImageView;
                    View $r14 = view.findViewById(C0001R.C0003id.profilePictureImageView);
                    CircleImageView circleImageView = (CircleImageView) $r14;
                    if (circleImageView != null) {
                        $i0 = C0001R.C0003id.uploadProgressTextView;
                        View $r15 = view.findViewById(C0001R.C0003id.uploadProgressTextView);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.uploadingProgressBar;
                            View $r16 = view.findViewById(C0001R.C0003id.uploadingProgressBar);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ViewPictureUploadFragmentBinding $r8 = new ViewPictureUploadFragmentBinding($r9, $r2, $r3, guideline, circleImageView, textView, progressBar);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadFragmentBinding inflate(LayoutInflater layoutInflater) {
        ViewPictureUploadFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewPictureUploadFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_picture_upload_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewPictureUploadFragmentBinding $r3 = bind($r2);
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
