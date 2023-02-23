package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentEnforceBvnVerificationBinding implements InterfaceC8209a {
    public final KudiButton button;
    public final ImageView icon;
    public final TextView message;
    private final ConstraintLayout rootView;
    public final TextView title;

    private FragmentEnforceBvnVerificationBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.button = kudiButton;
        this.icon = imageView;
        this.message = textView;
        this.title = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnforceBvnVerificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.button;
        View $r1 = view.findViewById(C0001R.C0003id.button);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.icon;
            View $r12 = view.findViewById(C0001R.C0003id.icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.message;
                View $r13 = view.findViewById(C0001R.C0003id.message);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.title;
                    View $r14 = view.findViewById(C0001R.C0003id.title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        FragmentEnforceBvnVerificationBinding $r6 = new FragmentEnforceBvnVerificationBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static FragmentEnforceBvnVerificationBinding inflate(LayoutInflater layoutInflater) {
        FragmentEnforceBvnVerificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentEnforceBvnVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_enforce_bvn_verification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentEnforceBvnVerificationBinding $r3 = bind($r2);
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
