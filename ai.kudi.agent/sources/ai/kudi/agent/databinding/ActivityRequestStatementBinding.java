package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityRequestStatementBinding implements InterfaceC8209a {
    public final KudiButton fireEmailButton;
    public final KudiInputField fromDateView;
    public final ImageView imageView11;
    public final ImageView instagramView;
    private final ConstraintLayout rootView;
    public final TextView textView7;
    public final KudiInputField toDateview;

    private ActivityRequestStatementBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiInputField kudiInputField, ImageView imageView, ImageView imageView2, TextView textView, KudiInputField kudiInputField2) {
        this.rootView = constraintLayout;
        this.fireEmailButton = kudiButton;
        this.fromDateView = kudiInputField;
        this.imageView11 = imageView;
        this.instagramView = imageView2;
        this.textView7 = textView;
        this.toDateview = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityRequestStatementBinding bind(View view) {
        int $i0 = C0001R.C0003id.fireEmailButton;
        View $r1 = view.findViewById(C0001R.C0003id.fireEmailButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.fromDateView;
            View $r12 = view.findViewById(C0001R.C0003id.fromDateView);
            KudiInputField $r3 = (KudiInputField) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.imageView11;
                View $r13 = view.findViewById(C0001R.C0003id.imageView11);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.instagramView;
                    View $r14 = view.findViewById(C0001R.C0003id.instagramView);
                    ImageView imageView2 = (ImageView) $r14;
                    if (imageView2 != null) {
                        $i0 = C0001R.C0003id.textView7;
                        View $r15 = view.findViewById(C0001R.C0003id.textView7);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.toDateview;
                            View $r16 = view.findViewById(C0001R.C0003id.toDateview);
                            KudiInputField kudiInputField = (KudiInputField) $r16;
                            if (kudiInputField != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ActivityRequestStatementBinding $r8 = new ActivityRequestStatementBinding($r9, $r2, $r3, imageView, imageView2, textView, kudiInputField);
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
    public static ActivityRequestStatementBinding inflate(LayoutInflater layoutInflater) {
        ActivityRequestStatementBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityRequestStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_request_statement, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityRequestStatementBinding $r3 = bind($r2);
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
