package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityUnauthorizedInstallationBinding implements InterfaceC8209a {
    public final TextView exitAppTextView;
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final Button updateButton;
    public final TextView updateInstructionsTextView;

    private ActivityUnauthorizedInstallationBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, Button button, TextView textView2) {
        this.rootView = constraintLayout;
        this.exitAppTextView = textView;
        this.imageView = imageView;
        this.updateButton = button;
        this.updateInstructionsTextView = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityUnauthorizedInstallationBinding bind(View view) {
        int $i0 = C0001R.C0003id.exitAppTextView;
        View $r1 = view.findViewById(C0001R.C0003id.exitAppTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.imageView;
            View $r12 = view.findViewById(C0001R.C0003id.imageView);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.updateButton;
                View $r13 = view.findViewById(C0001R.C0003id.updateButton);
                Button $r4 = (Button) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.updateInstructionsTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.updateInstructionsTextView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ActivityUnauthorizedInstallationBinding $r6 = new ActivityUnauthorizedInstallationBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityUnauthorizedInstallationBinding inflate(LayoutInflater layoutInflater) {
        ActivityUnauthorizedInstallationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityUnauthorizedInstallationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_unauthorized_installation, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityUnauthorizedInstallationBinding $r3 = bind($r2);
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
