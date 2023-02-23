package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentVerifiedInformationBinding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: VerifiedInformationFragment.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0001J$\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/VerifiedInformationFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentVerifiedInformationBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentVerifiedInformationBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.VerifiedInformationFragment */
/* loaded from: classes.dex */
public final class VerifiedInformationFragment extends Fragment implements BaseViewBinder<FragmentVerifiedInformationBinding> {
    public static final Companion Companion;
    public static final String USER_PARAM = "USER";
    private final /* synthetic */ BaseViewBinderImpl<FragmentVerifiedInformationBinding> $$delegate_0;

    /* compiled from: VerifiedInformationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/VerifiedInformationFragment$Companion;", "", "()V", "USER_PARAM", "", "newInstance", "Lai/kudi/agent/settings/personal/ui/VerifiedInformationFragment;", "user", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.VerifiedInformationFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final VerifiedInformationFragment newInstance(UserProfile userProfile) {
            Log_OC.getArray(userProfile, "user");
            VerifiedInformationFragment $r3 = new VerifiedInformationFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("USER", userProfile);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VerifiedInformationFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final VerifiedInformationFragment newInstance(UserProfile userProfile) {
        Companion $r0 = Companion;
        VerifiedInformationFragment $r1 = $r0.newInstance(userProfile);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentVerifiedInformationBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentVerifiedInformationBinding $r3 = (FragmentVerifiedInformationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentVerifiedInformationBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentVerifiedInformationBinding fragmentVerifiedInformationBinding, Fragment fragment) {
        Log_OC.getArray(fragmentVerifiedInformationBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentVerifiedInformationBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentVerifiedInformationBinding $r4 = (FragmentVerifiedInformationBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentVerifiedInformationBinding $r4 = FragmentVerifiedInformationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r18 == 11) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.personal.p027ui.VerifiedInformationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentVerifiedInformationBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentVerifiedInformationBinding $r3 = (FragmentVerifiedInformationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentVerifiedInformationBinding $r1 = requireBinding();
        return $r1;
    }
}
