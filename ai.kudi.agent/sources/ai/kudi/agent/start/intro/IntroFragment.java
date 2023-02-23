package ai.kudi.agent.start.intro;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.ViewStartIntroFragmentBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.start.UnauthorizedInstallationActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IntroFragment.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0001J$\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/start/intro/IntroFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ViewStartIntroFragmentBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/ViewStartIntroFragmentBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IntroFragment extends Fragment implements BaseViewBinder<ViewStartIntroFragmentBinding> {
    private static final String ARG_DRAWABLE = "args_image";
    private static final String ARG_SUBTITLE = "args_sub_title";
    private static final String ARG_TITLE = "args_title";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<ViewStartIntroFragmentBinding> $$delegate_0;

    /* compiled from: IntroFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/start/intro/IntroFragment$Companion;", "", "()V", "ARG_DRAWABLE", "", "ARG_SUBTITLE", "ARG_TITLE", "newInstance", "Lai/kudi/agent/start/intro/IntroFragment;", "drawable", "", KudiPin.KUDI_PIN_TITLE, "subTitle", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final IntroFragment newInstance(int i, int i2, int i3) {
            IntroFragment $r1 = new IntroFragment();
            Bundle $r2 = new Bundle();
            $r2.putInt(IntroFragment.ARG_DRAWABLE, i);
            $r2.putInt(IntroFragment.ARG_TITLE, i2);
            $r2.putInt(IntroFragment.ARG_SUBTITLE, i3);
            $r1.setArguments($r2);
            return $r1;
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
    public IntroFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewStartIntroFragmentBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        ViewStartIntroFragmentBinding $r3 = (ViewStartIntroFragmentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        ViewStartIntroFragmentBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(ViewStartIntroFragmentBinding viewStartIntroFragmentBinding, Fragment fragment) {
        Log_OC.getArray(viewStartIntroFragmentBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(viewStartIntroFragmentBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        ViewStartIntroFragmentBinding $r4 = (ViewStartIntroFragmentBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        ViewStartIntroFragmentBinding $r4 = ViewStartIntroFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater, container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer $r6;
        Integer $r62;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        ViewStartIntroFragmentBinding $r3 = requireBinding();
        TextView $r4 = $r3.title;
        Bundle $r2 = getArguments();
        Integer $r5 = null;
        if ($r2 == null) {
            $r6 = null;
        } else {
            int $i0 = $r2.getInt(ARG_TITLE);
            $r6 = Integer.valueOf($i0);
        }
        Log_OC.append($r6);
        int $i02 = $r6.intValue();
        String $r7 = getString($i02);
        $r4.setText($r7);
        TextView $r42 = $r3.subTitle;
        Bundle $r22 = getArguments();
        if ($r22 == null) {
            $r62 = null;
        } else {
            int $i03 = $r22.getInt(ARG_SUBTITLE);
            $r62 = Integer.valueOf($i03);
        }
        Log_OC.append($r62);
        int $i04 = $r62.intValue();
        String $r72 = getString($i04);
        $r42.setText($r72);
        ImageView $r8 = $r3.introImageView;
        try {
            Bundle $r23 = getArguments();
            if ($r23 != null) {
                int $i05 = $r23.getInt(ARG_DRAWABLE);
                $r5 = Integer.valueOf($i05);
            }
            Log_OC.append($r5);
            int $i06 = $r5.intValue();
            $r8.setImageResource($i06);
        } catch (Resources.NotFoundException $r9) {
            $r9.printStackTrace();
            FragmentActivity $r11 = getActivity();
            Intent $r10 = new Intent($r11, UnauthorizedInstallationActivity.class);
            startActivity($r10);
            FragmentActivity $r112 = requireActivity();
            $r112.finish();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewStartIntroFragmentBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        ViewStartIntroFragmentBinding $r3 = (ViewStartIntroFragmentBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        ViewStartIntroFragmentBinding $r1 = requireBinding();
        return $r1;
    }
}
