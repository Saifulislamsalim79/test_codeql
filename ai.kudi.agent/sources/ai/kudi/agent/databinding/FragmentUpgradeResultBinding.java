package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentUpgradeResultBinding implements InterfaceC8209a {
    public final KudiButton button;
    public final KudiTextView descriptionTextView;
    public final ImageView icon;
    private final ConstraintLayout rootView;
    public final KudiTextView titleTextView;

    private FragmentUpgradeResultBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, KudiTextView kudiTextView, ImageView imageView, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.button = kudiButton;
        this.descriptionTextView = kudiTextView;
        this.icon = imageView;
        this.titleTextView = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeResultBinding bind(View view) {
        int $i0 = C0001R.C0003id.button;
        View $r1 = view.findViewById(C0001R.C0003id.button);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.description_text_view;
            View $r12 = view.findViewById(C0001R.C0003id.description_text_view);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.icon;
                View $r13 = view.findViewById(C0001R.C0003id.icon);
                ImageView $r4 = (ImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.title_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.title_text_view);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        FragmentUpgradeResultBinding $r6 = new FragmentUpgradeResultBinding((ConstraintLayout) view, $r2, $r3, $r4, kudiTextView);
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
    public static FragmentUpgradeResultBinding inflate(LayoutInflater layoutInflater) {
        FragmentUpgradeResultBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentUpgradeResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_upgrade_result, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentUpgradeResultBinding $r3 = bind($r2);
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
