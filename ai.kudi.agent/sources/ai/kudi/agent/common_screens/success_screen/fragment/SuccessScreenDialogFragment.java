package ai.kudi.agent.common_screens.success_screen.fragment;

import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.core.databinding.FragmentSuccessScreenBinding;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SuccessScreenDialogFragment.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0001J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\t\u0010\u001b\u001a\u00020\u0003H\u0096\u0001R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/common_screens/success_screen/fragment/SuccessScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/FragmentSuccessScreenBinding;", "()V", "action", "Lkotlin/Function0;", "", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/FragmentSuccessScreenBinding;", "option", "Lai/kudi/agent/common_screens/success_screen/dto/SuccessScreenCustomOption;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SuccessScreenDialogFragment extends h implements BaseViewBinder<FragmentSuccessScreenBinding> {
    private static final String ARG_CUSTOM_OPTION = "arg_custom_option";
    public static final Companion Companion;
    public static final String PAGE_KEY = "SuccessScreenDialogFragment";
    private final /* synthetic */ BaseViewBinderImpl<FragmentSuccessScreenBinding> $$delegate_0;
    private InterfaceC11756a<C13666w> action;
    private SuccessScreenCustomOption option;

    /* compiled from: SuccessScreenDialogFragment.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/common_screens/success_screen/fragment/SuccessScreenDialogFragment$Companion;", "", "()V", "ARG_CUSTOM_OPTION", "", "TAG", "newInstance", "Lai/kudi/agent/common_screens/success_screen/fragment/SuccessScreenDialogFragment;", "option", "Lai/kudi/agent/common_screens/success_screen/dto/SuccessScreenCustomOption;", "action", "Lkotlin/Function0;", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final SuccessScreenDialogFragment newInstance() {
            SuccessScreenCustomOption $r2 = new SuccessScreenCustomOption(null, null, null, false, false, false, 0, 0, 0, 0, 0, 0, false, 8191, null);
            SuccessScreenDialogFragment $r1 = newInstance($r2, null);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SuccessScreenDialogFragment newInstance(SuccessScreenCustomOption successScreenCustomOption) {
            Log_OC.getArray(successScreenCustomOption, "option");
            SuccessScreenDialogFragment $r1 = newInstance(successScreenCustomOption, null);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SuccessScreenDialogFragment newInstance(SuccessScreenCustomOption successScreenCustomOption, InterfaceC11756a interfaceC11756a) {
            Log_OC.getArray(successScreenCustomOption, "option");
            SuccessScreenDialogFragment $r3 = new SuccessScreenDialogFragment();
            $r3.action = interfaceC11756a;
            Bundle $r4 = new Bundle();
            $r4.putParcelable(SuccessScreenDialogFragment.ARG_CUSTOM_OPTION, successScreenCustomOption);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r4);
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
    public SuccessScreenDialogFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-0  reason: not valid java name */
    public static final void m39132onViewCreated$lambda3$lambda0(SuccessScreenDialogFragment successScreenDialogFragment, View view) {
        Log_OC.getArray(successScreenDialogFragment, "this$0");
        FragmentActivity $r0 = successScreenDialogFragment.getActivity();
        if ($r0 == null) {
            return;
        }
        $r0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    public static final void m39133onViewCreated$lambda3$lambda1(SuccessScreenDialogFragment successScreenDialogFragment, View view) {
        Log_OC.getArray(successScreenDialogFragment, "this$0");
        FragmentActivity $r0 = successScreenDialogFragment.requireActivity();
        Log_OC.loadImage($r0, "requireActivity()");
        AppCompatActivityExtKt.callSupport($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39134onViewCreated$lambda3$lambda2(FragmentSuccessScreenBinding fragmentSuccessScreenBinding, SuccessScreenDialogFragment successScreenDialogFragment, View view) {
        Log_OC.getArray(fragmentSuccessScreenBinding, "$this_apply");
        Log_OC.getArray(successScreenDialogFragment, "this$0");
        KudiButton $r3 = fragmentSuccessScreenBinding.btnAction;
        $r3.m38032f();
        SuccessScreenCustomOption $r4 = successScreenDialogFragment.option;
        if ($r4 == null) {
            Log_OC.LogError("option");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        boolean $z0 = $r4.getShouldDismissImmediately();
        if ($z0) {
            successScreenDialogFragment.dismiss();
        }
        InterfaceC11756a $r5 = successScreenDialogFragment.action;
        if ($r5 == null) {
            return;
        }
        $r5.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSuccessScreenBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSuccessScreenBinding $r3 = (FragmentSuccessScreenBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSuccessScreenBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSuccessScreenBinding fragmentSuccessScreenBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSuccessScreenBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSuccessScreenBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSuccessScreenBinding $r4 = (FragmentSuccessScreenBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = C0038R.style.FullScreenDialogStyle;
        setStyle(0, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSuccessScreenBinding $r4 = FragmentSuccessScreenBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        SuccessScreenCustomOption $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r2.getParcelable(ARG_CUSTOM_OPTION);
            $r3 = (SuccessScreenCustomOption) $r4;
        }
        Log_OC.append($r3);
        Log_OC.loadImage($r3, "arguments?.getParcelable(ARG_CUSTOM_OPTION)!!");
        this.option = $r3;
        final FragmentSuccessScreenBinding $r5 = requireBinding();
        ImageView $r6 = $r5.ivIcon;
        Context $r7 = requireContext();
        SuccessScreenCustomOption $r32 = this.option;
        if ($r32 == null) {
            Log_OC.LogError("option");
            NullPointerException r20 = new NullPointerException("Null throw statement replaced by Soot");
            throw r20;
        }
        int $i0 = $r32.getIcon();
        $r6.setImageDrawable(C1335a.m36322f($r7, $i0));
        KudiTextView $r9 = $r5.tvTitle;
        SuccessScreenCustomOption $r33 = this.option;
        if ($r33 == null) {
            Log_OC.LogError("option");
            NullPointerException r202 = new NullPointerException("Null throw statement replaced by Soot");
            throw r202;
        }
        String $r10 = $r33.getTitleText();
        $r9.setText($r10);
        TextView $r92 = $r5.tvTitle;
        Context $r72 = requireContext();
        SuccessScreenCustomOption $r34 = this.option;
        if ($r34 == null) {
            Log_OC.LogError("option");
            NullPointerException r203 = new NullPointerException("Null throw statement replaced by Soot");
            throw r203;
        }
        int $i02 = $r34.getTitleTextColor();
        TextView $r14 = $r92;
        $r14.setTextColor(C1335a.m36324d($r72, $i02));
        TextView $r93 = $r5.tvMsg;
        SuccessScreenCustomOption $r35 = this.option;
        if ($r35 == null) {
            Log_OC.LogError("option");
            NullPointerException r204 = new NullPointerException("Null throw statement replaced by Soot");
            throw r204;
        }
        CharSequence $r102 = $r35.getMsgText();
        TextView $r142 = $r93;
        $r142.setText($r102);
        TextView $r94 = $r5.tvMsg;
        Context $r73 = requireContext();
        SuccessScreenCustomOption $r36 = this.option;
        if ($r36 == null) {
            Log_OC.LogError("option");
            NullPointerException r205 = new NullPointerException("Null throw statement replaced by Soot");
            throw r205;
        }
        int $i03 = $r36.getMsgTextColor();
        TextView $r143 = $r94;
        $r143.setTextColor(C1335a.m36324d($r73, $i03));
        ViewGroup $r11 = $r5.container;
        Context $r74 = requireContext();
        SuccessScreenCustomOption $r37 = this.option;
        if ($r37 == null) {
            Log_OC.LogError("option");
            NullPointerException r206 = new NullPointerException("Null throw statement replaced by Soot");
            throw r206;
        }
        int $i04 = $r37.getBackgroundColor();
        ViewGroup r24 = $r11;
        r24.setBackgroundColor(C1335a.m36324d($r74, $i04));
        SuccessScreenCustomOption $r38 = this.option;
        if ($r38 == null) {
            Log_OC.LogError("option");
            NullPointerException r207 = new NullPointerException("Null throw statement replaced by Soot");
            throw r207;
        }
        boolean $z0 = $r38.getShouldHideBottomView();
        if ($z0) {
            View $r112 = $r5.bottomView.getRoot();
            Log_OC.loadImage($r112, "bottomView.root");
            View $r1 = $r112;
            ViewExtKt.hide$default($r1, false, 1, null);
        }
        SuccessScreenCustomOption $r39 = this.option;
        if ($r39 == null) {
            Log_OC.LogError("option");
            NullPointerException r208 = new NullPointerException("Null throw statement replaced by Soot");
            throw r208;
        }
        boolean $z02 = $r39.getShouldHideCloseButton();
        if ($z02) {
            ImageView $r62 = $r5.closeImageView;
            Log_OC.loadImage($r62, "closeImageView");
            ViewExtKt.hide$default($r62, false, 1, null);
        } else {
            ImageView $r63 = $r5.closeImageView;
            $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.common_screens.success_screen.fragment.FileSelectionFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SuccessScreenDialogFragment $r22 = SuccessScreenDialogFragment.this;
                    SuccessScreenDialogFragment.m39132onViewCreated$lambda3$lambda0($r22, view2);
                }
            });
        }
        TextView $r144 = $r5.bottomView.buttomViewHeader;
        int $i05 = C0038R.string.other_issues_question;
        String $r103 = getString($i05);
        $r144.setText($r103);
        BottomLoginViewBinding $r12 = $r5.bottomView;
        TextView $r145 = $r12.buttomViewHeader;
        ViewGroup $r113 = $r12.getRoot();
        ViewGroup r242 = $r113;
        Context $r75 = r242.getContext();
        int $i06 = C0038R.color.black;
        $r145.setTextColor(C1335a.m36324d($r75, $i06));
        BottomLoginViewBinding $r122 = $r5.bottomView;
        TextView $r146 = $r122.loginButton;
        ViewGroup $r114 = $r122.getRoot();
        ViewGroup r243 = $r114;
        Context $r76 = r243.getContext();
        int $i07 = C0038R.color.black;
        $r146.setTextColor(C1335a.m36324d($r76, $i07));
        ViewGroup $r115 = $r5.bottomView.getRoot();
        ViewGroup $r15 = $r5.bottomView.getRoot();
        ViewGroup r244 = $r15;
        Context $r77 = r244.getContext();
        int $i08 = C0038R.color.white;
        ViewGroup r245 = $r115;
        r245.setBackgroundColor(C1335a.m36324d($r77, $i08));
        TextView $r147 = $r5.bottomView.loginButton;
        int $i09 = C0038R.string.call_support;
        String $r104 = getString($i09);
        $r147.setText($r104);
        Context $r78 = requireContext();
        Log_OC.loadImage($r78, "requireContext()");
        int $i010 = C0038R.C0039drawable.ic_call_support;
        Drawable $r8 = ContextExtKt.getKudiDrawable($r78, $i010);
        if ($r8 != null) {
            ViewGroup $r116 = $r5.bottomView.getRoot();
            ViewGroup r246 = $r116;
            Context $r79 = r246.getContext();
            Log_OC.loadImage($r79, "bottomView.root.context");
            int $i011 = C0038R.color.yellow;
            ViewExtKt.tint($r8, $r79, $i011);
        }
        TextView $r148 = $r5.bottomView.loginButton;
        $r148.setCompoundDrawablesRelativeWithIntrinsicBounds($r8, (Drawable) null, (Drawable) null, (Drawable) null);
        TextView $r149 = $r5.bottomView.loginButton;
        $r149.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.common_screens.success_screen.fragment.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SuccessScreenDialogFragment $r22 = SuccessScreenDialogFragment.this;
                SuccessScreenDialogFragment.m39133onViewCreated$lambda3$lambda1($r22, view2);
            }
        });
        InterfaceC11756a $r17 = this.action;
        if ($r17 == null) {
            View $r18 = $r5.btnAction;
            Log_OC.loadImage($r18, "btnAction");
            View $r13 = $r18;
            ViewExtKt.hide$default($r13, false, 1, null);
        } else {
            KudiButton $r182 = $r5.btnAction;
            SuccessScreenCustomOption $r310 = this.option;
            if ($r310 == null) {
                Log_OC.LogError("option");
                NullPointerException r209 = new NullPointerException("Null throw statement replaced by Soot");
                throw r209;
            }
            String $r105 = $r310.getActionBtnText();
            $r182.setText($r105);
            ViewGroup $r183 = $r5.btnAction;
            ViewGroup r247 = $r183;
            r247.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.common_screens.success_screen.fragment.SearchResultsFragment$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FragmentSuccessScreenBinding $r22 = FragmentSuccessScreenBinding.this;
                    SuccessScreenDialogFragment $r311 = this;
                    SuccessScreenDialogFragment.m39134onViewCreated$lambda3$lambda2($r22, $r311, view2);
                }
            });
        }
        SuccessScreenCustomOption $r311 = this.option;
        if ($r311 == null) {
            Log_OC.LogError("option");
            NullPointerException r2010 = new NullPointerException("Null throw statement replaced by Soot");
            throw r2010;
        }
        boolean $z03 = $r311.getShouldHideActionButton();
        if ($z03) {
            View $r184 = $r5.btnAction;
            Log_OC.loadImage($r184, "btnAction");
            View $r16 = $r184;
            ViewExtKt.hide$default($r16, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSuccessScreenBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSuccessScreenBinding $r3 = (FragmentSuccessScreenBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSuccessScreenBinding $r1 = requireBinding();
        return $r1;
    }
}
