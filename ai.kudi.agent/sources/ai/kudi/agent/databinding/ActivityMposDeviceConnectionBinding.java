package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityMposDeviceConnectionBinding implements InterfaceC8209a {
    public final Guideline guideline;
    public final ProgressBar progressBar2;
    private final ConstraintLayout rootView;
    public final TextView welcomeText;

    private ActivityMposDeviceConnectionBinding(ConstraintLayout constraintLayout, Guideline guideline, ProgressBar progressBar, TextView textView) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.progressBar2 = progressBar;
        this.welcomeText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMposDeviceConnectionBinding bind(View view) {
        int $i0 = C0001R.C0003id.guideline;
        View $r1 = view.findViewById(C0001R.C0003id.guideline);
        Guideline $r2 = (Guideline) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.progressBar2;
            View $r12 = view.findViewById(C0001R.C0003id.progressBar2);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.welcomeText;
                View $r13 = view.findViewById(C0001R.C0003id.welcomeText);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ActivityMposDeviceConnectionBinding $r5 = new ActivityMposDeviceConnectionBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMposDeviceConnectionBinding inflate(LayoutInflater layoutInflater) {
        ActivityMposDeviceConnectionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMposDeviceConnectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_mpos_device_connection, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityMposDeviceConnectionBinding $r3 = bind($r2);
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
