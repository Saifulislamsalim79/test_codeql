package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSecurityBinding implements InterfaceC8209a {
    public final SwitchCompat bioMetricswitch;
    public final ImageView imageView5;
    public final ImageView imageView6;
    public final KudiTextView learnMoreView;
    private final ScrollView rootView;
    public final RecyclerView securityOptionsRecyclerView;
    public final ProgressBar suspendingOutletView;
    public final KudiTextView textView5;
    public final KudiTextView turnOffBiometricsView;

    private FragmentSecurityBinding(ScrollView scrollView, SwitchCompat switchCompat, ImageView imageView, ImageView imageView2, KudiTextView kudiTextView, RecyclerView recyclerView, ProgressBar progressBar, KudiTextView kudiTextView2, KudiTextView kudiTextView3) {
        this.rootView = scrollView;
        this.bioMetricswitch = switchCompat;
        this.imageView5 = imageView;
        this.imageView6 = imageView2;
        this.learnMoreView = kudiTextView;
        this.securityOptionsRecyclerView = recyclerView;
        this.suspendingOutletView = progressBar;
        this.textView5 = kudiTextView2;
        this.turnOffBiometricsView = kudiTextView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSecurityBinding bind(View view) {
        int $i0 = C0001R.C0003id.bioMetricswitch;
        View $r1 = view.findViewById(C0001R.C0003id.bioMetricswitch);
        SwitchCompat $r2 = (SwitchCompat) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.imageView5;
            View $r12 = view.findViewById(C0001R.C0003id.imageView5);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.imageView6;
                View $r13 = view.findViewById(C0001R.C0003id.imageView6);
                ImageView imageView2 = (ImageView) $r13;
                if (imageView2 != null) {
                    $i0 = C0001R.C0003id.learnMoreView;
                    View $r14 = view.findViewById(C0001R.C0003id.learnMoreView);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.securityOptionsRecyclerView;
                        View $r15 = view.findViewById(C0001R.C0003id.securityOptionsRecyclerView);
                        RecyclerView recyclerView = (RecyclerView) $r15;
                        if (recyclerView != null) {
                            $i0 = C0001R.C0003id.suspendingOutletView;
                            View $r16 = view.findViewById(C0001R.C0003id.suspendingOutletView);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                $i0 = C0001R.C0003id.textView5;
                                View $r17 = view.findViewById(C0001R.C0003id.textView5);
                                KudiTextView $r8 = (KudiTextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.turnOffBiometricsView;
                                    View $r18 = view.findViewById(C0001R.C0003id.turnOffBiometricsView);
                                    KudiTextView $r9 = (KudiTextView) $r18;
                                    if ($r9 != null) {
                                        ScrollView $r11 = (ScrollView) view;
                                        FragmentSecurityBinding $r10 = new FragmentSecurityBinding($r11, $r2, imageView, imageView2, kudiTextView, recyclerView, progressBar, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSecurityBinding inflate(LayoutInflater layoutInflater) {
        FragmentSecurityBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_security, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSecurityBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
