package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class OutletMgtSecurityFragmentBinding implements InterfaceC8209a {
    public final FragmentResetPin2Binding resetPinLayout;
    private final FrameLayout rootView;
    public final FragmentSecurityBinding securityLayout;

    private OutletMgtSecurityFragmentBinding(FrameLayout frameLayout, FragmentResetPin2Binding fragmentResetPin2Binding, FragmentSecurityBinding fragmentSecurityBinding) {
        this.rootView = frameLayout;
        this.resetPinLayout = fragmentResetPin2Binding;
        this.securityLayout = fragmentSecurityBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtSecurityFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.resetPinLayout;
        View $r1 = view.findViewById(C0001R.C0003id.resetPinLayout);
        if ($r1 != null) {
            FragmentResetPin2Binding $r2 = FragmentResetPin2Binding.bind($r1);
            View $r12 = view.findViewById(C0001R.C0003id.security_Layout);
            if ($r12 != null) {
                FragmentSecurityBinding $r3 = FragmentSecurityBinding.bind($r12);
                FrameLayout $r5 = (FrameLayout) view;
                OutletMgtSecurityFragmentBinding $r4 = new OutletMgtSecurityFragmentBinding($r5, $r2, $r3);
                return $r4;
            }
            $i0 = C0001R.C0003id.security_Layout;
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtSecurityFragmentBinding inflate(LayoutInflater layoutInflater) {
        OutletMgtSecurityFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletMgtSecurityFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.outlet_mgt_security_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        OutletMgtSecurityFragmentBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
