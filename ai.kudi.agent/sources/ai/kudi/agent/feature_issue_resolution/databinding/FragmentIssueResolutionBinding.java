package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentIssueResolutionBinding implements InterfaceC8209a {
    public final AddImageViewBinding addImage1;
    public final AddImageViewBinding addImage2;
    public final AddImageViewBinding addImage3;
    public final KudiTextView addImageText;
    public final KudiButton continueButton;
    public final ImageView image1;
    public final ImageView image2;
    public final ImageView image3;
    public final LinearLayout layoutAddPics;
    private final ConstraintLayout rootView;
    public final KudiTextView skipThisStep;
    public final TextInputEditText textInputEditText;
    public final TextInputLayout textInputLayout;
    public final KudiTextView textView6;

    private FragmentIssueResolutionBinding(ConstraintLayout constraintLayout, AddImageViewBinding addImageViewBinding, AddImageViewBinding addImageViewBinding2, AddImageViewBinding addImageViewBinding3, KudiTextView kudiTextView, KudiButton kudiButton, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, KudiTextView kudiTextView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, KudiTextView kudiTextView3) {
        this.rootView = constraintLayout;
        this.addImage1 = addImageViewBinding;
        this.addImage2 = addImageViewBinding2;
        this.addImage3 = addImageViewBinding3;
        this.addImageText = kudiTextView;
        this.continueButton = kudiButton;
        this.image1 = imageView;
        this.image2 = imageView2;
        this.image3 = imageView3;
        this.layoutAddPics = linearLayout;
        this.skipThisStep = kudiTextView2;
        this.textInputEditText = textInputEditText;
        this.textInputLayout = textInputLayout;
        this.textView6 = kudiTextView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueResolutionBinding bind(View view) {
        int $i0 = C0214R.C0216id.addImage1;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            AddImageViewBinding $r2 = AddImageViewBinding.bind($r1);
            $i0 = C0214R.C0216id.addImage2;
            View $r12 = view.findViewById($i0);
            if ($r12 != null) {
                AddImageViewBinding $r3 = AddImageViewBinding.bind($r12);
                $i0 = C0214R.C0216id.addImage3;
                View $r13 = view.findViewById($i0);
                if ($r13 != null) {
                    AddImageViewBinding $r4 = AddImageViewBinding.bind($r13);
                    $i0 = C0214R.C0216id.addImageText;
                    KudiTextView kudiTextView = (KudiTextView) view.findViewById($i0);
                    if (kudiTextView != null) {
                        $i0 = C0214R.C0216id.continueButton;
                        KudiButton kudiButton = (KudiButton) view.findViewById($i0);
                        if (kudiButton != null) {
                            $i0 = C0214R.C0216id.image1;
                            ImageView imageView = (ImageView) view.findViewById($i0);
                            if (imageView != null) {
                                $i0 = C0214R.C0216id.image2;
                                ImageView imageView2 = (ImageView) view.findViewById($i0);
                                if (imageView2 != null) {
                                    $i0 = C0214R.C0216id.image3;
                                    ImageView imageView3 = (ImageView) view.findViewById($i0);
                                    if (imageView3 != null) {
                                        $i0 = C0214R.C0216id.layout_add_pics;
                                        LinearLayout $r10 = (LinearLayout) view.findViewById($i0);
                                        if ($r10 != null) {
                                            $i0 = C0214R.C0216id.skip_this_step;
                                            KudiTextView $r11 = (KudiTextView) view.findViewById($i0);
                                            if ($r11 != null) {
                                                $i0 = C0214R.C0216id.textInputEditText;
                                                TextInputEditText $r122 = (TextInputEditText) view.findViewById($i0);
                                                if ($r122 != null) {
                                                    $i0 = C0214R.C0216id.textInputLayout;
                                                    TextInputLayout $r132 = (TextInputLayout) view.findViewById($i0);
                                                    if ($r132 != null) {
                                                        $i0 = C0214R.C0216id.textView6;
                                                        KudiTextView $r14 = (KudiTextView) view.findViewById($i0);
                                                        if ($r14 != null) {
                                                            ConstraintLayout $r16 = (ConstraintLayout) view;
                                                            FragmentIssueResolutionBinding $r15 = new FragmentIssueResolutionBinding($r16, $r2, $r3, $r4, kudiTextView, kudiButton, imageView, imageView2, imageView3, $r10, $r11, $r122, $r132, $r14);
                                                            return $r15;
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
        Resources $r17 = view.getResources();
        String $r18 = $r17.getResourceName($i0);
        NullPointerException $r19 = new NullPointerException("Missing required view with ID: ".concat($r18));
        throw $r19;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueResolutionBinding inflate(LayoutInflater layoutInflater) {
        FragmentIssueResolutionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentIssueResolutionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_issue_resolution;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentIssueResolutionBinding $r3 = bind($r2);
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
