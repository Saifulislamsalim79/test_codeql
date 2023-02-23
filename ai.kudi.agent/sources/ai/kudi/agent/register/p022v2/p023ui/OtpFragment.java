package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentEnterOtpBinding;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.data.models.OtpFragmentRes;
import ai.kudi.agent.register.p022v2.p023ui.receivers.KudiOtpSmsReceiver;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.OtpViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.OtpViewData;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import java.util.ArrayList;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OtpFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 R2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001RB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003H\u0014J\b\u0010-\u001a\u00020\u0002H\u0014J\b\u0010.\u001a\u00020+H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0014J&\u00104\u001a\u00020+2\b\b\u0002\u00105\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00107\u001a\u00020\u000eJ\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0002J\u0006\u0010;\u001a\u00020+J\u0010\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J$\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010H\u001a\u00020+2\b\u0010I\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010J\u001a\u00020+H\u0016J\b\u0010K\u001a\u00020+H\u0016J\u001a\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020C2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J*\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010:H\u0003R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006S"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/OtpFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/OtpViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/OtpViewData;", "Lai/kudi/agent/databinding/FragmentEnterOtpBinding;", "Lai/kudi/agent/register/v2/ui/receivers/KudiOtpSmsReceiver$OtpListener;", "()V", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/data/models/OtpFragmentData;", "grabbedOtpList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "isAuthInProgress", "", "()Z", "setAuthInProgress", "(Z)V", "otpCallBacks", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "getOtpCallBacks", "()Lai/kudi/agent/register/data/models/OtpCallBacks;", "setOtpCallBacks", "(Lai/kudi/agent/register/data/models/OtpCallBacks;)V", "otpData", "Lai/kudi/agent/register/data/models/OtpData;", "getOtpData", "()Lai/kudi/agent/register/data/models/OtpData;", "setOtpData", "(Lai/kudi/agent/register/data/models/OtpData;)V", "otpUssd", "otpViewModel", "getOtpViewModel", "()Lai/kudi/agent/register/v2/ui/viewModels/OtpViewModel;", "setOtpViewModel", "(Lai/kudi/agent/register/v2/ui/viewModels/OtpViewModel;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "applyViewData", "", "viewData", "createViewModel", "dialOtpUssd", "getOtpColor", "", "it", "getVMType", "Ljava/lang/Class;", "handleError", "shouldShowToast", "errorMsg", "isAuthError", "handleResParams", "otpFragmentRes", "Lai/kudi/agent/register/data/models/OtpFragmentRes;", "initCountDownTimer", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOtpReceived", "otp", "onStart", "onStop", "onViewCreated", "view", "setupUssdOtpCard", "ussdCode", "allowUssdOtp", "allowUssdOtpForOnboarding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.OtpFragment */
/* loaded from: classes.dex */
public final class OtpFragment extends BaseMVVMViewBindingFragment<OtpViewModel, OtpViewData, FragmentEnterOtpBinding> implements KudiOtpSmsReceiver.OtpListener {
    public static final Companion Companion;
    private static final String OTP_DATA = "OTP_DATA";
    private static final int REQUEST_CODE_DIAL_OTP_USSD = 1101;
    private static final int REQUEST_CODE_RECEIVE_SMS = 2101;
    private OtpFragmentData data;
    private ArrayList<String> grabbedOtpList;
    private boolean isAuthInProgress;
    private OtpCallBacks otpCallBacks;
    private OtpData otpData;
    private String otpUssd;
    public OtpViewModel otpViewModel;
    public Frame remoteConfig;

    /* compiled from: OtpFragment.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/OtpFragment$Companion;", "", "()V", OtpFragment.OTP_DATA, "", "REQUEST_CODE_DIAL_OTP_USSD", "", "REQUEST_CODE_RECEIVE_SMS", "newInstance", "Lai/kudi/agent/register/v2/ui/OtpFragment;", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "otpCallBacks", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.OtpFragment$Companion */
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
        public final OtpFragment newInstance(OtpFragmentData otpFragmentData, OtpCallBacks otpCallBacks) {
            Log_OC.getArray(otpFragmentData, "otpFragmentData");
            Log_OC.getArray(otpCallBacks, "otpCallBacks");
            OtpFragment $r3 = new OtpFragment();
            $r3.setOtpCallBacks(otpCallBacks);
            Bundle $r4 = new Bundle();
            $r4.putParcelable(OtpFragment.OTP_DATA, otpFragmentData);
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
    public OtpFragment() {
        ArrayList $r1 = new ArrayList();
        this.grabbedOtpList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void dialOtpUssd() {
        String $r1;
        String $r12;
        String $r13 = this.otpUssd;
        if ($r13 == null) {
            Log_OC.LogError("otpUssd");
            NullPointerException $r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r6;
        }
        String $r2 = Uri.encode("#");
        Log_OC.loadImage($r2, "encode(\"#\")");
        $r1 = C13276s.m5451A($r13, "#", $r2, false, 4, null);
        String $r22 = Uri.encode("*");
        Log_OC.loadImage($r22, "encode(\"*\")");
        $r12 = C13276s.m5451A($r1, "*", $r22, false, 4, null);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException $r62 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r62;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        AppCompatActivityExtKt.dialTelephone($r4, $r5, $r12, REQUEST_CODE_DIAL_OTP_USSD);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getOtpColor(int i) {
        Context $r1 = requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        int $i0 = ContextExtKt.getKudiColor($r1, i);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void handleError$default(OtpFragment otpFragment, boolean $z0, String $r1, boolean $z1, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = true;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r1 = null;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = false;
        }
        otpFragment.handleError($z0, $r1, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleResParams(OtpFragmentRes otpFragmentRes) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentEnterOtpBinding $r3 = (FragmentEnterOtpBinding) $r2;
        Integer $r4 = otpFragmentRes.getPageBackground();
        if ($r4 != null) {
            int $i0 = $r4.intValue();
            ViewGroup $r5 = $r3.otpRootView;
            ViewGroup r10 = $r5;
            r10.setBackgroundColor(getOtpColor($i0));
        }
        Integer $r42 = otpFragmentRes.getHeaderTextColor();
        if ($r42 != null) {
            int $i02 = $r42.intValue();
            TextView $r6 = $r3.otpHeaderText;
            $r6.setTextColor(getOtpColor($i02));
        }
        Integer $r43 = otpFragmentRes.getSubheaderTextColor();
        if ($r43 != null) {
            int $i03 = $r43.intValue();
            TextView $r62 = $r3.otpSubHeaderText;
            $r62.setTextColor(getOtpColor($i03));
        }
        Integer $r44 = otpFragmentRes.getResendOtpTextColor();
        if ($r44 != null) {
            int $i04 = $r44.intValue();
            TextView $r7 = $r3.resendOtp;
            TextView $r63 = $r7;
            $r63.setTextColor(getOtpColor($i04));
        }
        Integer $r45 = otpFragmentRes.getTimeLeftTextColor();
        if ($r45 != null) {
            int $i05 = $r45.intValue();
            TextView $r64 = $r3.time;
            $r64.setTextColor(getOtpColor($i05));
        }
        Integer $r46 = otpFragmentRes.getUssdOtpBackground();
        if ($r46 != null) {
            int $i06 = $r46.intValue();
            ViewGroup $r52 = $r3.generateOtpLayout;
            Context $r8 = requireContext();
            Log_OC.loadImage($r8, "requireContext()");
            Drawable $r9 = ContextExtKt.getKudiDrawable($r8, $i06);
            ViewGroup r102 = $r52;
            r102.setBackground($r9);
        }
        Integer $r47 = otpFragmentRes.getGenerateOtpTextBackGround();
        if ($r47 != null) {
            int $i07 = $r47.intValue();
            TextView $r65 = $r3.generateOtpTextView;
            $r65.setBackgroundColor(getOtpColor($i07));
        }
        Integer $r48 = otpFragmentRes.getGenerateOtpTextColor();
        if ($r48 != null) {
            int $i08 = $r48.intValue();
            TextView $r66 = $r3.generateOtpTextView;
            $r66.setTextColor(getOtpColor($i08));
        }
        Integer $r49 = otpFragmentRes.getOtpTextContentTextColor();
        if ($r49 != null) {
            int $i09 = $r49.intValue();
            TextView $r67 = $r3.tvContent;
            $r67.setTextColor(getOtpColor($i09));
        }
        Integer $r410 = otpFragmentRes.getDialTextColor();
        if ($r410 != null) {
            int $i010 = $r410.intValue();
            TextView $r68 = $r3.btnDial;
            int $i1 = getOtpColor($i010);
            $r68.setTextColor($i1);
            Context $r82 = requireContext();
            Log_OC.loadImage($r82, "requireContext()");
            Drawable $r92 = ContextExtKt.getKudiDrawable($r82, C0001R.C0002drawable.ic_call);
            Drawable $r93 = $r92 == null ? null : $r92.mutate();
            if ($r93 != null) {
                Context $r83 = requireContext();
                Log_OC.loadImage($r83, "requireContext()");
                ContextExtKt.setKudiColorFilter($r93, $r83, $i010);
            }
            TextView $r69 = $r3.btnDial;
            $r69.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, $r93, (Drawable) null);
        }
        Integer $r411 = otpFragmentRes.getCopyTextColor();
        if ($r411 != null) {
            int $i011 = $r411.intValue();
            TextView $r610 = $r3.btnCopy;
            int $i12 = getOtpColor($i011);
            $r610.setTextColor($i12);
            Context $r84 = requireContext();
            Log_OC.loadImage($r84, "requireContext()");
            Drawable $r94 = ContextExtKt.getKudiDrawable($r84, C0001R.C0002drawable.ic_copy);
            Drawable $r95 = $r94 == null ? null : $r94.mutate();
            if ($r95 != null) {
                Context $r85 = requireContext();
                Log_OC.loadImage($r85, "requireContext()");
                ContextExtKt.setKudiColorFilter($r95, $r85, $i011);
            }
            TextView $r611 = $r3.btnCopy;
            $r611.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, $r95, (Drawable) null);
        }
        Integer $r412 = otpFragmentRes.getDialAndCopyTextBackground();
        if ($r412 == null) {
            return;
        }
        int $i012 = $r412.intValue();
        TextView $r612 = $r3.btnCopy;
        Context $r86 = requireContext();
        Log_OC.loadImage($r86, "requireContext()");
        Drawable $r96 = ContextExtKt.getKudiDrawable($r86, $i012);
        $r612.setBackground($r96);
        TextView $r613 = $r3.btnDial;
        Context $r87 = requireContext();
        Log_OC.loadImage($r87, "requireContext()");
        Drawable $r97 = ContextExtKt.getKudiDrawable($r87, $i012);
        $r613.setBackground($r97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-4$lambda-1  reason: not valid java name */
    public static final void m40450onViewCreated$lambda6$lambda4$lambda1(OtpFragment otpFragment, View view) {
        Log_OC.getArray(otpFragment, "this$0");
        OtpCallBacks $r0 = otpFragment.getOtpCallBacks();
        if ($r0 == null) {
            return;
        }
        $r0.onBottomViewActionClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40451onViewCreated$lambda6$lambda4$lambda2(OtpFragment otpFragment, View view) {
        Log_OC.getArray(otpFragment, "this$0");
        OtpCallBacks $r2 = otpFragment.getOtpCallBacks();
        if ($r2 == null) {
            return;
        }
        OtpData $r3 = otpFragment.getOtpData();
        $r2.onResendOtpClicked($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40452onViewCreated$lambda6$lambda5(OtpFragment otpFragment, Item item) {
        Log_OC.getArray(otpFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            Frame $r2 = otpFragment.getRemoteConfig();
            String $r3 = $r2.getSetting("otp_ussd");
            Log_OC.loadImage($r3, "remoteConfig.getString(\"otp_ussd\")");
            Frame $r22 = otpFragment.getRemoteConfig();
            boolean $z02 = $r22.m20912d("enable_ussd_otp");
            Frame $r23 = otpFragment.getRemoteConfig();
            boolean $z1 = $r23.m20912d("enable_ussd_otp_for_onboarding");
            InterfaceC8209a $r4 = otpFragment.getBinding();
            if ($r4 != null) {
                OtpFragmentData $r5 = otpFragment.data;
                OtpFragmentRes $r6 = $r5 == null ? null : $r5.getOtpFragmentRes();
                otpFragment.setupUssdOtpCard($r3, $z02, $z1, $r6);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupUssdOtpCard(final String str, boolean z, boolean z2, final OtpFragmentRes otpFragmentRes) {
        InterfaceC8209a $r4 = requireBinding();
        final FragmentEnterOtpBinding $r5 = (FragmentEnterOtpBinding) $r4;
        final OtpFragmentData $r3 = this.data;
        if ($r3 != null && z) {
            boolean $z0 = $r3.getShouldShowUssdOtp();
            if (!$z0 || z2) {
                Handler $r6 = new Handler();
                $r6.postDelayed(new Runnable() { // from class: ai.kudi.agent.register.v2.ui.b
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OtpFragment $r1 = OtpFragment.this;
                        FragmentEnterOtpBinding $r2 = $r5;
                        String $r32 = str;
                        OtpFragmentData $r42 = $r3;
                        OtpFragmentRes $r52 = otpFragmentRes;
                        OtpFragment.m40453setupUssdOtpCard$lambda11$lambda10$lambda9($r1, $r2, $r32, $r42, $r52);
                    }
                }, 20000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUssdOtpCard$lambda-11$lambda-10$lambda-9  reason: not valid java name */
    public static final void m40453setupUssdOtpCard$lambda11$lambda10$lambda9(final OtpFragment otpFragment, FragmentEnterOtpBinding fragmentEnterOtpBinding, final String str, OtpFragmentData otpFragmentData, OtpFragmentRes otpFragmentRes) {
        Integer $r12;
        String $r10;
        Log_OC.getArray(otpFragment, "this$0");
        Log_OC.getArray(fragmentEnterOtpBinding, "$this_apply");
        Log_OC.getArray(str, "$ussdCode");
        Log_OC.getArray(otpFragmentData, "$it");
        boolean $z0 = otpFragment.isVisible();
        if ($z0) {
            RelativeLayout $r5 = fragmentEnterOtpBinding.containerOtp;
            Log_OC.loadImage($r5, "containerOtp");
            ViewExtKt.show($r5);
            otpFragment.otpUssd = str;
            TextView $r6 = fragmentEnterOtpBinding.tvContent;
            StringBuilder $r7 = new StringBuilder();
            $r7.append("Dial ");
            $r7.append(str);
            $r7.append(" using ");
            OtpData $r8 = otpFragmentData.getOtpData();
            String $r9 = "";
            if ($r8 != null && ($r10 = $r8.getPhoneNumber()) != null) {
                $r9 = $r10;
            }
            $r7.append($r9);
            String $r92 = $r7.toString();
            Context $r11 = otpFragment.requireContext();
            Log_OC.loadImage($r11, "requireContext()");
            int $i0 = C0001R.color.colorPrimary;
            if (otpFragmentRes != null && ($r12 = otpFragmentRes.getOtpTextContentTextColor()) != null) {
                $i0 = $r12.intValue();
            }
            SpannableStringBuilder $r13 = StringExtKt.colorSpan($r92, $r11, str, $i0);
            $r6.setText($r13);
            TextView $r62 = fragmentEnterOtpBinding.btnCopy;
            $r62.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtpFragment $r2 = OtpFragment.this;
                    String $r3 = str;
                    OtpFragment.m40454setupUssdOtpCard$lambda11$lambda10$lambda9$lambda7($r2, $r3, view);
                }
            });
            TextView $r63 = fragmentEnterOtpBinding.btnDial;
            $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.NoteEditor$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtpFragment $r2 = OtpFragment.this;
                    OtpFragment.m40455setupUssdOtpCard$lambda11$lambda10$lambda9$lambda8($r2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupUssdOtpCard$lambda-11$lambda-10$lambda-9$lambda-7  reason: not valid java name */
    public static final void m40454setupUssdOtpCard$lambda11$lambda10$lambda9$lambda7(OtpFragment otpFragment, String str, View view) {
        Log_OC.getArray(otpFragment, "this$0");
        Log_OC.getArray(str, "$ussdCode");
        Context $r1 = otpFragment.requireContext();
        Log_OC.loadImage($r1, "requireContext()");
        RandomUtilKt.copyToClipboard($r1, str, "otp_ussd", "USSD code copied to clipboard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupUssdOtpCard$lambda-11$lambda-10$lambda-9$lambda-8  reason: not valid java name */
    public static final void m40455setupUssdOtpCard$lambda11$lambda10$lambda9$lambda8(OtpFragment otpFragment, View view) {
        Log_OC.getArray(otpFragment, "this$0");
        otpFragment.dialOtpUssd();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OtpViewData $r2 = (OtpViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OtpViewData otpViewData) {
        Log_OC.getArray(otpViewData, "viewData");
        InterfaceC8209a $r3 = requireBinding();
        FragmentEnterOtpBinding $r4 = (FragmentEnterOtpBinding) $r3;
        String $r5 = otpViewData.getTimeLeft();
        if ($r5 == null) {
            return;
        }
        TextView $r6 = $r4.time;
        Object[] $r1 = {$r5};
        String $r7 = getString(C0001R.string.time_left, $r1);
        $r6.setText($r7);
        boolean $z0 = Log_OC.append($r5, "00:00");
        if ($z0) {
            View $r8 = $r4.resendOtp;
            Log_OC.loadImage($r8, "resendOtp");
            View r9 = $r8;
            ViewExtKt.show(r9);
            return;
        }
        View $r82 = $r4.resendOtp;
        Log_OC.loadImage($r82, "resendOtp");
        View r92 = $r82;
        ViewExtKt.hide$default(r92, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OtpViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OtpViewModel createViewModel() {
        OtpViewModel $r1 = getOtpViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpCallBacks getOtpCallBacks() {
        OtpCallBacks r1 = this.otpCallBacks;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpData getOtpData() {
        OtpData r1 = this.otpData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OtpViewModel getOtpViewModel() {
        OtpViewModel $r1 = this.otpViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("otpViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OtpViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void handleError(boolean z, String str, boolean z2) {
        OtpData $r3;
        if (z2) {
            ArrayList $r2 = this.grabbedOtpList;
            this = this;
            boolean $z1 = $r2.isEmpty();
            if ((!$z1) && ($r3 = this.otpData) != null) {
                ArrayList $r22 = this.grabbedOtpList;
                Object $r4 = $r22.get(0);
                Log_OC.loadImage($r4, "grabbedOtpList[0]");
                String $r5 = (String) $r4;
                $r3.setOtp($r5);
                OtpCallBacks $r6 = this.getOtpCallBacks();
                if ($r6 != null) {
                    $r6.onOtpEntered($r3);
                }
                ArrayList $r23 = this.grabbedOtpList;
                this = this;
                String str2 = (String) $r23.remove(0);
            }
        }
        if (str == null) {
            return;
        }
        if (z) {
            FragmentActivity $r7 = this.requireActivity();
            Log_OC.loadImage($r7, "requireActivity()");
            ContextExtKt.toast$default($r7, str, 0, 2, (Object) null);
        }
        InterfaceC8209a $r8 = this.requireBinding();
        FragmentEnterOtpBinding $r9 = (FragmentEnterOtpBinding) $r8;
        PinEntryView $r10 = $r9.pinEntryView;
        $r10.setBorder(true);
        PinEntryView $r102 = $r9.pinEntryView;
        $r102.setText("");
        FragmentActivity $r72 = this.getActivity();
        if ($r72 == null) {
            NullPointerException $r12 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r12;
        }
        AppCompatActivity $r11 = (AppCompatActivity) $r72;
        AppCompatActivityExtKt.showKeyboard($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void initCountDownTimer() {
        OtpViewModel $r1 = getOtpViewModel();
        OtpData $r2 = this.otpData;
        long $l0 = $r2 == null ? 300L : $r2.getExpiryInSeconds();
        $r1.initCountdownTimer($l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isAuthInProgress() {
        boolean z0 = this.isAuthInProgress;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = requireActivity();
        Application $r3 = $r2.getApplication();
        if ($r3 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r6;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.getApplicationComponent();
        $r5.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(OTP_DATA);
        OtpFragmentData $r3 = (OtpFragmentData) $r2;
        this.data = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEnterOtpBinding $r4 = FragmentEnterOtpBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.p022v2.p023ui.receivers.KudiOtpSmsReceiver.OtpListener
    public void onOtpReceived(String str) {
        if (str == null) {
            return;
        }
        boolean $z0 = isAuthInProgress();
        if ($z0) {
            ArrayList $r4 = this.grabbedOtpList;
            $r4.add(str);
            return;
        }
        OtpData $r2 = getOtpData();
        if ($r2 == null) {
            return;
        }
        $r2.setOtp(str);
        OtpCallBacks $r3 = getOtpCallBacks();
        if ($r3 == null) {
            return;
        }
        $r3.onOtpEntered($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        KudiOtpSmsReceiver.Companion $r1 = KudiOtpSmsReceiver.Companion;
        $r1.bindListener(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        KudiOtpSmsReceiver.Companion $r1 = KudiOtpSmsReceiver.Companion;
        $r1.unbindListener();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String $r9;
        String $r92;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentEnterOtpBinding $r4 = (FragmentEnterOtpBinding) $r3;
        OtpFragmentData $r5 = this.data;
        if ($r5 != null) {
            setOtpData($r5.getOtpData());
            initCountDownTimer();
            TextView $r7 = $r4.otpHeaderText;
            String $r8 = $r5.getHeader();
            String $r93 = $r8;
            if ($r8 == null) {
                $r93 = getString(C0001R.string.verify_phone_number);
            }
            $r7.setText($r93);
            int $i0 = Build.VERSION.SDK_INT;
            String $r82 = "";
            if ($i0 >= 24) {
                TextView $r72 = $r4.otpSubHeaderText;
                Object[] $r10 = new Object[1];
                OtpData $r6 = getOtpData();
                if ($r6 != null && ($r92 = $r6.getPhoneNumber()) != null) {
                    $r82 = $r92;
                }
                $r10[0] = $r82;
                Spanned $r11 = Html.fromHtml(getString(C0001R.string.otp_title, $r10), 0);
                $r72.setText($r11);
            } else {
                TextView $r73 = $r4.otpSubHeaderText;
                Object[] $r102 = new Object[1];
                OtpData $r62 = getOtpData();
                if ($r62 != null && ($r9 = $r62.getPhoneNumber()) != null) {
                    $r82 = $r9;
                }
                $r102[0] = $r82;
                Spanned $r112 = Html.fromHtml(getString(C0001R.string.otp_title, $r102));
                $r73.setText($r112);
            }
            BottomLoginViewBinding $r12 = $r4.otpBottomView;
            TextView $r74 = $r12.loginButton;
            String $r83 = $r5.getBottomViewActionText();
            String $r94 = $r83;
            if ($r83 == null) {
                $r94 = getString(C0001R.string.login_here);
            }
            $r74.setText($r94);
            BottomLoginViewBinding $r122 = $r4.otpBottomView;
            TextView $r75 = $r122.loginButton;
            $r75.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OtpFragment $r2 = OtpFragment.this;
                    OtpFragment.m40450onViewCreated$lambda6$lambda4$lambda1($r2, view2);
                }
            });
            BottomLoginViewBinding $r123 = $r4.otpBottomView;
            TextView $r76 = $r123.buttomViewHeader;
            String $r84 = $r5.getBottomViewHeaderText();
            String $r95 = $r84;
            if ($r84 == null) {
                $r95 = getString(C0001R.string.phone_no_access);
            }
            $r76.setText($r95);
            TextView $r14 = $r4.resendOtp;
            TextView $r77 = $r14;
            $r77.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.EditEventView$5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OtpFragment $r2 = OtpFragment.this;
                    OtpFragment.m40451onViewCreated$lambda6$lambda4$lambda2($r2, view2);
                }
            });
            boolean $z0 = $r5.getShowBottomView();
            if ($z0) {
                BottomLoginViewBinding $r124 = $r4.otpBottomView;
                View $r16 = $r124.getRoot();
                Log_OC.loadImage($r16, "otpBottomView.root");
                View $r1 = $r16;
                ViewExtKt.show($r1);
            } else {
                BottomLoginViewBinding $r125 = $r4.otpBottomView;
                View $r162 = $r125.getRoot();
                Log_OC.loadImage($r162, "otpBottomView.root");
                View $r13 = $r162;
                ViewExtKt.hide$default($r13, false, 1, null);
            }
            boolean $z02 = $r5.getShouldShowHeader();
            if ($z02) {
                TextView $r78 = $r4.otpHeaderText;
                Log_OC.loadImage($r78, "otpHeaderText");
                ViewExtKt.show($r78);
            } else {
                TextView $r79 = $r4.otpHeaderText;
                if ($r79 != null) {
                    ViewExtKt.hide$default($r79, false, 1, null);
                }
            }
            PinEntryView $r17 = $r4.pinEntryView;
            $r17.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() { // from class: ai.kudi.agent.register.v2.ui.OtpFragment$onViewCreated$1$1$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // ai.kudi.agent.custom.views.pinentryview.PinEntryView.OnPinEnteredListener
                public void onPinEntered(String str) {
                    Log_OC.getArray(str, "pin");
                    OtpData $r32 = OtpFragment.this.getOtpData();
                    if ($r32 == null) {
                        return;
                    }
                    OtpFragment $r15 = OtpFragment.this;
                    $r32.setOtp(str);
                    FragmentActivity $r42 = $r15.requireActivity();
                    Log_OC.loadImage($r42, "requireActivity()");
                    ContextExtKt.hideKeyboard($r42);
                    OtpCallBacks $r52 = $r15.getOtpCallBacks();
                    if ($r52 == null) {
                        return;
                    }
                    $r52.onOtpEntered($r32);
                }
            });
            OtpFragmentRes $r19 = $r5.getOtpFragmentRes();
            if ($r19 != null) {
                handleResParams($r19);
            }
        }
        Frame $r20 = getRemoteConfig();
        Item $r21 = $r20.m20914c();
        $r21.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.register.v2.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38535b(Item item) {
                OtpFragment $r2 = OtpFragment.this;
                OtpFragment.m40452onViewCreated$lambda6$lambda5($r2, item);
            }
        });
    }

    public final void setAuthInProgress(boolean z) {
        this.isAuthInProgress = z;
    }

    public final void setOtpCallBacks(OtpCallBacks otpCallBacks) {
        this.otpCallBacks = otpCallBacks;
    }

    public final void setOtpData(OtpData otpData) {
        this.otpData = otpData;
    }

    public final void setOtpViewModel(OtpViewModel otpViewModel) {
        Log_OC.getArray(otpViewModel, "<set-?>");
        this.otpViewModel = otpViewModel;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }
}
