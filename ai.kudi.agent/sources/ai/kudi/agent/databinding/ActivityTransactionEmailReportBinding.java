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
public final class ActivityTransactionEmailReportBinding implements InterfaceC8209a {
    public final KudiButton fireEmailButton;
    public final KudiInputField fromDateView;
    public final ImageView imageView11;
    public final ImageView instagramView;
    private final ConstraintLayout rootView;
    public final KudiInputField selectStatusView;
    public final KudiInputField selectTypeView;
    public final TextView textView7;
    public final KudiInputField toDateview;
    public final ImageView twitterView;

    private ActivityTransactionEmailReportBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiInputField kudiInputField, ImageView imageView, ImageView imageView2, KudiInputField kudiInputField2, KudiInputField kudiInputField3, TextView textView, KudiInputField kudiInputField4, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.fireEmailButton = kudiButton;
        this.fromDateView = kudiInputField;
        this.imageView11 = imageView;
        this.instagramView = imageView2;
        this.selectStatusView = kudiInputField2;
        this.selectTypeView = kudiInputField3;
        this.textView7 = textView;
        this.toDateview = kudiInputField4;
        this.twitterView = imageView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionEmailReportBinding bind(View view) {
        int $i0 = C0001R.C0003id.fireEmailButton;
        View $r1 = view.findViewById(C0001R.C0003id.fireEmailButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.fromDateView;
            View $r12 = view.findViewById(C0001R.C0003id.fromDateView);
            KudiInputField kudiInputField = (KudiInputField) $r12;
            if (kudiInputField != null) {
                $i0 = C0001R.C0003id.imageView11;
                View $r13 = view.findViewById(C0001R.C0003id.imageView11);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.instagramView;
                    View $r14 = view.findViewById(C0001R.C0003id.instagramView);
                    ImageView imageView2 = (ImageView) $r14;
                    if (imageView2 != null) {
                        $i0 = C0001R.C0003id.selectStatusView;
                        View $r15 = view.findViewById(C0001R.C0003id.selectStatusView);
                        KudiInputField kudiInputField2 = (KudiInputField) $r15;
                        if (kudiInputField2 != null) {
                            $i0 = C0001R.C0003id.selectTypeView;
                            View $r16 = view.findViewById(C0001R.C0003id.selectTypeView);
                            KudiInputField kudiInputField3 = (KudiInputField) $r16;
                            if (kudiInputField3 != null) {
                                $i0 = C0001R.C0003id.textView7;
                                View $r17 = view.findViewById(C0001R.C0003id.textView7);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.toDateview;
                                    View $r18 = view.findViewById(C0001R.C0003id.toDateview);
                                    KudiInputField $r9 = (KudiInputField) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.twitterView;
                                        View $r19 = view.findViewById(C0001R.C0003id.twitterView);
                                        ImageView $r10 = (ImageView) $r19;
                                        if ($r10 != null) {
                                            ConstraintLayout $r122 = (ConstraintLayout) view;
                                            ActivityTransactionEmailReportBinding $r11 = new ActivityTransactionEmailReportBinding($r122, $r2, kudiInputField, imageView, imageView2, kudiInputField2, kudiInputField3, $r8, $r9, $r10);
                                            return $r11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionEmailReportBinding inflate(LayoutInflater layoutInflater) {
        ActivityTransactionEmailReportBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionEmailReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_transaction_email_report, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityTransactionEmailReportBinding $r3 = bind($r2);
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
