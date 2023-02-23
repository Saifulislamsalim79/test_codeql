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
public final class FragmentWelcomeBinding implements InterfaceC8209a {
    public final KudiButton fundWalletButton;
    public final TextView headerSubtitle;
    public final TextView headerText;
    public final ImageView image;
    private final ConstraintLayout rootView;
    public final TextView skipButton;

    private FragmentWelcomeBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.rootView = constraintLayout;
        this.fundWalletButton = kudiButton;
        this.headerSubtitle = textView;
        this.headerText = textView2;
        this.image = imageView;
        this.skipButton = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWelcomeBinding bind(View view) {
        int $i0 = C0001R.C0003id.fundWalletButton;
        View $r1 = view.findViewById(C0001R.C0003id.fundWalletButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.headerSubtitle;
            View $r12 = view.findViewById(C0001R.C0003id.headerSubtitle);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.headerText;
                View $r13 = view.findViewById(C0001R.C0003id.headerText);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.image;
                    View $r14 = view.findViewById(C0001R.C0003id.image);
                    ImageView imageView = (ImageView) $r14;
                    if (imageView != null) {
                        $i0 = C0001R.C0003id.skipButton;
                        View $r15 = view.findViewById(C0001R.C0003id.skipButton);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            FragmentWelcomeBinding $r7 = new FragmentWelcomeBinding($r8, $r2, $r3, $r4, imageView, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater) {
        FragmentWelcomeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentWelcomeBinding $r3 = bind($r2);
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
