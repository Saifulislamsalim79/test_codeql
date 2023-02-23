package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ViewSignupInsuranceBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignUpState;
import ai.kudi.agent.settings.account.p025ui.viewModel.InsuranceSignupViewModel;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: InsuranceSignUpFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0018H\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/InsuranceSignUpFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignupViewModel;", "Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignUpState;", "Lai/kudi/agent/databinding/ViewSignupInsuranceBinding;", "()V", "insuranceViewModel", "getInsuranceViewModel", "()Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignupViewModel;", "setInsuranceViewModel", "(Lai/kudi/agent/settings/account/ui/viewModel/InsuranceSignupViewModel;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "submitButton", "Lai/kudi/dip/library/button/KudiButton;", "getSubmitButton", "()Lai/kudi/dip/library/button/KudiButton;", "setSubmitButton", "(Lai/kudi/dip/library/button/KudiButton;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setListeners", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.InsuranceSignUpFragment */
/* loaded from: classes.dex */
public final class InsuranceSignUpFragment extends BaseMVVMViewBindingFragment<InsuranceSignupViewModel, InsuranceSignUpState, ViewSignupInsuranceBinding> {
    public InsuranceSignupViewModel insuranceViewModel;
    public Frame remoteConfig;
    private KudiButton submitButton;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40687onViewCreated$lambda1(final InsuranceSignUpFragment insuranceSignUpFragment, View view) {
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Frame $r3 = insuranceSignUpFragment.getRemoteConfig();
        Item $r4 = $r3.m20914c();
        $r4.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.settings.account.ui.fragment.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38422c(Item item) {
                InsuranceSignUpFragment $r2 = InsuranceSignUpFragment.this;
                InsuranceSignUpFragment.m40688onViewCreated$lambda1$lambda0($r2, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m40688onViewCreated$lambda1$lambda0(InsuranceSignUpFragment insuranceSignUpFragment, Item item) {
        FragmentActivity $r2;
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if (!$z0 || ($r2 = insuranceSignUpFragment.getActivity()) == null) {
            return;
        }
        Frame $r3 = insuranceSignUpFragment.getRemoteConfig();
        String $r4 = $r3.getSetting("terms_and_conditions_url");
        Log_OC.loadImage($r4, "remoteConfig.getString(\"terms_and_conditions_url\")");
        AppCompatActivityExtKt.openUrlInApp($r2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setListeners() {
        final C11811v r15 = new C11811v();
        InterfaceC8209a $r2 = requireBinding();
        ViewSignupInsuranceBinding $r3 = (ViewSignupInsuranceBinding) $r2;
        final LinearLayout $r4 = $r3.employeesContainer;
        Log_OC.loadImage($r4, "requireBinding().employeesContainer");
        InterfaceC8209a $r22 = requireBinding();
        ViewSignupInsuranceBinding $r32 = (ViewSignupInsuranceBinding) $r22;
        TextView $r5 = $r32.addEmployees;
        Log_OC.loadImage($r5, "requireBinding().addEmployees");
        InterfaceC8209a $r23 = requireBinding();
        ViewSignupInsuranceBinding $r33 = (ViewSignupInsuranceBinding) $r23;
        final TextView $r6 = $r33.termsAndCondition;
        Log_OC.loadImage($r6, "requireBinding().termsAndCondition");
        InterfaceC8209a $r24 = requireBinding();
        ViewSignupInsuranceBinding $r34 = (ViewSignupInsuranceBinding) $r24;
        this.submitButton = $r34.continueButton;
        InterfaceC8209a $r25 = requireBinding();
        ViewSignupInsuranceBinding $r35 = (ViewSignupInsuranceBinding) $r25;
        View $r8 = $r35.successContainer;
        Log_OC.loadImage($r8, "requireBinding().successContainer");
        View r20 = $r8;
        ViewExtKt.hide$default(r20, false, 1, null);
        InterfaceC8209a $r26 = requireBinding();
        ViewSignupInsuranceBinding $r36 = (ViewSignupInsuranceBinding) $r26;
        View $r82 = $r36.signUpContainer;
        Log_OC.loadImage($r82, "requireBinding().signUpContainer");
        View r202 = $r82;
        ViewExtKt.show(r202);
        ViewGroup $r7 = this.submitButton;
        if ($r7 != null) {
            ViewGroup r21 = $r7;
            r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsuranceSignUpFragment $r27 = InsuranceSignUpFragment.this;
                    LinearLayout $r37 = $r4;
                    InsuranceSignUpFragment.m40689setListeners$lambda3($r27, $r37, view);
                }
            });
        }
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.SettingsActivity
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InsuranceSignUpFragment $r27 = InsuranceSignUpFragment.this;
                C11811v $r37 = r15;
                LinearLayout $r42 = $r4;
                InsuranceSignUpFragment.m40691setListeners$lambda4($r27, $r37, $r42, view);
            }
        });
        Frame $r11 = getRemoteConfig();
        Item $r12 = $r11.m20914c();
        $r12.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.settings.account.ui.fragment.FixedTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38429c(Item item) {
                TextView $r27 = $r6;
                InsuranceSignUpFragment $r37 = this;
                InsuranceSignUpFragment.m40692setListeners$lambda6($r27, $r37, item);
            }
        });
        InterfaceC8209a $r27 = requireBinding();
        ViewSignupInsuranceBinding $r37 = (ViewSignupInsuranceBinding) $r27;
        ViewGroup r212 = $r37.goBack;
        r212.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.FilenameDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InsuranceSignUpFragment $r28 = InsuranceSignUpFragment.this;
                InsuranceSignUpFragment.m40694setListeners$lambda7($r28, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m40689setListeners$lambda3(final InsuranceSignUpFragment insuranceSignUpFragment, final LinearLayout linearLayout, View view) {
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Log_OC.getArray(linearLayout, "$employeesContainer");
        FragmentManager $r5 = insuranceSignUpFragment.getChildFragmentManager();
        PreferenceActivity $r6 = insuranceSignUpFragment.getViewLifecycleOwner();
        $r5.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r6, new InterfaceC1523w() { // from class: ai.kudi.agent.settings.account.ui.fragment.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38431b(String str, Bundle bundle) {
                InsuranceSignUpFragment $r3 = InsuranceSignUpFragment.this;
                LinearLayout $r4 = linearLayout;
                InsuranceSignUpFragment.m40690setListeners$lambda3$lambda2($r3, $r4, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r7 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r52 = insuranceSignUpFragment.getChildFragmentManager();
        ((Chapter) $r7).show($r52, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        if ((!r15) == true) goto L12;
     */
    /* renamed from: setListeners$lambda-3$lambda-2  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40690setListeners$lambda3$lambda2(ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment r18, android.widget.LinearLayout r19, java.lang.String r20, android.os.Bundle r21) {
        /*
            java.lang.String r2 = "this$0"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "$employeesContainer"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "requestKey"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "result"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "Kudi pin auth key"
            r0 = r20
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r0, r2)
            if (r3 == 0) goto L91
            r0 = r18
            g.x.a r4 = r0.requireBinding()
            r6 = r4
            ai.kudi.agent.databinding.ViewSignupInsuranceBinding r6 = (ai.kudi.agent.databinding.ViewSignupInsuranceBinding) r6
            r5 = r6
            ai.kudi.dip.library.edittext.KudiInputField r7 = r5.phoneNumberInputField
            java.lang.String r20 = r7.getText()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0 = r19
            int r9 = r0.getChildCount()
            if (r9 <= 0) goto L7f
            r10 = 0
        L44:
            int r11 = r10 + 1
            r0 = r19
            android.view.View r12 = r0.getChildAt(r10)
            boolean r3 = r12 instanceof ai.kudi.dip.library.edittext.KudiInputField
            if (r3 == 0) goto L55
            r13 = r12
            ai.kudi.dip.library.edittext.KudiInputField r13 = (ai.kudi.dip.library.edittext.KudiInputField) r13
            r7 = r13
            goto L56
        L55:
            r7 = 0
        L56:
            r3 = 1
            if (r7 != 0) goto L5b
        L59:
            r3 = 0
            goto L71
        L5b:
            java.lang.String r14 = r7.getText()
            if (r14 != 0) goto L62
            goto L59
        L62:
            boolean r15 = kotlin.p549l0.C13265j.m5470u(r14)
            r16 = 1
            r0 = r16
            r15 = r15 ^ r0
            r16 = 1
            r0 = r16
            if (r15 != r0) goto L59
        L71:
            if (r3 == 0) goto L7a
            java.lang.String r14 = r7.getText()
            r8.add(r14)
        L7a:
            if (r11 < r9) goto L7d
            goto L7f
        L7d:
            r10 = r11
            goto L44
        L7f:
            r0 = r18
            ai.kudi.agent.core.util.ContextExtKt.hideKeyboard(r0)
            r0 = r18
            ai.kudi.agent.settings.account.ui.viewModel.InsuranceSignupViewModel r17 = r0.getInsuranceViewModel()
            r0 = r17
            r1 = r20
            r0.signUp(r1, r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.account.p025ui.fragment.InsuranceSignUpFragment.m40690setListeners$lambda3$lambda2(ai.kudi.agent.settings.account.ui.fragment.InsuranceSignUpFragment, android.widget.LinearLayout, java.lang.String, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setListeners$lambda-4  reason: not valid java name */
    public static final void m40691setListeners$lambda4(InsuranceSignUpFragment insuranceSignUpFragment, C11811v c11811v, LinearLayout linearLayout, View view) {
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Log_OC.getArray(c11811v, "$addedFields");
        Log_OC.getArray(linearLayout, "$employeesContainer");
        LayoutInflater $r4 = insuranceSignUpFragment.getLayoutInflater();
        View $r3 = $r4.inflate(C0001R.C0004layout.view_kudi_input_field, (ViewGroup) null);
        LinearLayout.LayoutParams $r5 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        $r5.setMargins(0, 50, 0, 0);
        $r3.setLayoutParams($r5);
        int $i0 = c11811v.f26498c;
        if ($i0 < 3) {
            c11811v.f26498c = $i0 + 1;
            linearLayout.addView($r3);
            return;
        }
        Context $r6 = insuranceSignUpFragment.requireContext();
        Log_OC.loadImage($r6, "requireContext()");
        ContextExtKt.toast$default($r6, "You can only add 3 employees", 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setListeners$lambda-6  reason: not valid java name */
    public static final void m40692setListeners$lambda6(TextView textView, final InsuranceSignUpFragment insuranceSignUpFragment, Item item) {
        Log_OC.getArray(textView, "$termsAndCondition");
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.NoteEditor$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsuranceSignUpFragment $r2 = InsuranceSignUpFragment.this;
                    InsuranceSignUpFragment.m40693setListeners$lambda6$lambda5($r2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setListeners$lambda-6$lambda-5  reason: not valid java name */
    public static final void m40693setListeners$lambda6$lambda5(InsuranceSignUpFragment insuranceSignUpFragment, View view) {
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        Context $r2 = insuranceSignUpFragment.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        Frame $r3 = insuranceSignUpFragment.getRemoteConfig();
        String $r4 = $r3.getSetting("third_party_terms");
        Log_OC.loadImage($r4, "remoteConfig.getString(\"third_party_terms\")");
        AppCompatActivityExtKt.openUrlInApp($r2, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setListeners$lambda-7  reason: not valid java name */
    public static final void m40694setListeners$lambda7(InsuranceSignUpFragment insuranceSignUpFragment, View view) {
        Log_OC.getArray(insuranceSignUpFragment, "this$0");
        FragmentActivity $r0 = insuranceSignUpFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        InsuranceSignUpState $r2 = (InsuranceSignUpState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(InsuranceSignUpState insuranceSignUpState) {
        Log_OC.getArray(insuranceSignUpState, "viewData");
        boolean $z0 = insuranceSignUpState instanceof InsuranceSignUpState.Success;
        if ($z0) {
            KudiButton $r2 = this.submitButton;
            if ($r2 != null) {
                $r2.m38033e();
            }
            InterfaceC8209a $r3 = requireBinding();
            ViewSignupInsuranceBinding $r4 = (ViewSignupInsuranceBinding) $r3;
            TextView $r5 = $r4.errorMessage;
            Log_OC.loadImage($r5, "requireBinding().errorMessage");
            ViewExtKt.hide$default($r5, false, 1, null);
            InterfaceC8209a $r32 = requireBinding();
            ViewSignupInsuranceBinding $r42 = (ViewSignupInsuranceBinding) $r32;
            View $r6 = $r42.successContainer;
            Log_OC.loadImage($r6, "requireBinding().successContainer");
            View r10 = $r6;
            ViewExtKt.show(r10);
            InterfaceC8209a $r33 = requireBinding();
            ViewSignupInsuranceBinding $r43 = (ViewSignupInsuranceBinding) $r33;
            View $r62 = $r43.signUpContainer;
            Log_OC.loadImage($r62, "requireBinding().signUpContainer");
            View r102 = $r62;
            ViewExtKt.hide$default(r102, false, 1, null);
            return;
        }
        boolean $z02 = insuranceSignUpState instanceof InsuranceSignUpState.Error;
        if ($z02) {
            KudiButton $r22 = this.submitButton;
            if ($r22 != null) {
                $r22.m38033e();
            }
            InterfaceC8209a $r34 = requireBinding();
            ViewSignupInsuranceBinding $r44 = (ViewSignupInsuranceBinding) $r34;
            TextView $r52 = $r44.errorMessage;
            String $r7 = insuranceSignUpState.getMessage();
            $r52.setText($r7);
            InterfaceC8209a $r35 = requireBinding();
            ViewSignupInsuranceBinding $r45 = (ViewSignupInsuranceBinding) $r35;
            TextView $r53 = $r45.errorMessage;
            Log_OC.loadImage($r53, "requireBinding().errorMessage");
            ViewExtKt.show($r53);
            return;
        }
        boolean $z03 = insuranceSignUpState instanceof InsuranceSignUpState.Loading;
        if ($z03) {
            KudiButton $r23 = this.submitButton;
            if ($r23 == null) {
                return;
            }
            $r23.m38032f();
            return;
        }
        boolean $z04 = insuranceSignUpState instanceof InsuranceSignUpState.AgentPhoneNumber;
        if ($z04) {
            InterfaceC8209a $r36 = requireBinding();
            ViewSignupInsuranceBinding $r46 = (ViewSignupInsuranceBinding) $r36;
            KudiInputField $r8 = $r46.phoneNumberInputField;
            InsuranceSignUpState.AgentPhoneNumber $r9 = (InsuranceSignUpState.AgentPhoneNumber) insuranceSignUpState;
            String $r72 = $r9.getPhoneNumber();
            $r8.setText($r72);
            InterfaceC8209a $r37 = requireBinding();
            ViewSignupInsuranceBinding $r47 = (ViewSignupInsuranceBinding) $r37;
            KudiInputField $r82 = $r47.phoneNumberInputField;
            $r82.disableEditablity();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        InsuranceSignupViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public InsuranceSignupViewModel createViewModel() {
        InsuranceSignupViewModel $r1 = getInsuranceViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceSignupViewModel getInsuranceViewModel() {
        InsuranceSignupViewModel $r1 = this.insuranceViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("insuranceViewModel");
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KudiButton getSubmitButton() {
        KudiButton r1 = this.submitButton;
        return r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return InsuranceSignupViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        ViewSignupInsuranceBinding $r4 = ViewSignupInsuranceBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        String $r3 = getString(C0001R.string.cash_insurance);
        Log_OC.loadImage($r3, "getString(R.string.cash_insurance)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        SettingsActivityExtKt.setSettingsTitleBarColor$default(this, C0001R.color.colorPrimary, 0, 2, null);
        setListeners();
        InsuranceSignupViewModel $r4 = getInsuranceViewModel();
        $r4.getUser();
        InterfaceC8209a $r5 = requireBinding();
        ViewSignupInsuranceBinding $r6 = (ViewSignupInsuranceBinding) $r5;
        TextView $r7 = $r6.learnMoreTextView;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InsuranceSignUpFragment $r2 = InsuranceSignUpFragment.this;
                InsuranceSignUpFragment.m40687onViewCreated$lambda1($r2, view2);
            }
        });
    }

    public final void setInsuranceViewModel(InsuranceSignupViewModel insuranceSignupViewModel) {
        Log_OC.getArray(insuranceSignupViewModel, "<set-?>");
        this.insuranceViewModel = insuranceSignupViewModel;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setSubmitButton(KudiButton kudiButton) {
        this.submitButton = kudiButton;
    }
}
