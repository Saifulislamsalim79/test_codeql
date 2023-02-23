package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.viewdata.CreateSavingsViewData;
import ai.kudi.agent.savings.databinding.FragmentCreateSavingsBinding;
import ai.kudi.agent.savings.viewmodel.CreateSavingsViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import dagger.android.p197e.C7429a;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CreateSavingsFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0016H\u0002J\u0016\u00100\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\b\u00102\u001a\u00020\u0016H\u0002J\u001a\u00103\u001a\u00020\u0016*\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001605H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00067"}, m10421d2 = {"Lai/kudi/agent/savings/ui/CreateSavingsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/CreateSavingsViewModel;", "Lai/kudi/agent/savings/data/viewdata/CreateSavingsViewData;", "Lai/kudi/agent/savings/databinding/FragmentCreateSavingsBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "durationList", "", "", "selectedDuration", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/CreateSavingsViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/CreateSavingsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initView", "isRadioButtonChecked", "", "()Ljava/lang/Boolean;", "launchDatePicker", "kudiInputField", "Lai/kudi/dip/library/edittext/KudiInputField;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "prepareSavings", "showDurationBottomSheet", "listData", "trackInteractions", "disableField", "action", "Lkotlin/Function0;", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.CreateSavingsFragment */
/* loaded from: classes.dex */
public final class CreateSavingsFragment extends BaseMVVMViewBindingFragment<CreateSavingsViewModel, CreateSavingsViewData, FragmentCreateSavingsBinding> {
    public static final Companion Companion;
    private static final long DELAY = 1000;
    private static final long INTERVAL = 5000;
    public static final String SAVING_FREQUENCY = "Daily";
    public Analytics analytics;
    private List<String> durationList;
    private String selectedDuration;
    public CreateSavingsViewModel viewModel;

    /* compiled from: CreateSavingsFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/savings/ui/CreateSavingsFragment$Companion;", "", "()V", "DELAY", "", "INTERVAL", "SAVING_FREQUENCY", "", "newInstance", "Lai/kudi/agent/savings/ui/CreateSavingsFragment;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.CreateSavingsFragment$Companion */
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
        public final CreateSavingsFragment newInstance() {
            CreateSavingsFragment $r1 = new CreateSavingsFragment();
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
    public CreateSavingsFragment() {
        List $r1;
        $r1 = C13726r.m3891e();
        this.durationList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void disableField(KudiInputField kudiInputField, final InterfaceC11756a interfaceC11756a) {
        EditText $r2 = kudiInputField.getEditText();
        $r2.setFocusable(false);
        $r2.setClickable(false);
        $r2.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.ItemClickListener
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11756a $r22 = InterfaceC11756a.this;
                CreateSavingsFragment.m40523disableField$lambda10$lambda9($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disableField$lambda-10$lambda-9  reason: not valid java name */
    public static final void m40523disableField$lambda10$lambda9(InterfaceC11756a interfaceC11756a, View view) {
        Log_OC.getArray(interfaceC11756a, "$action");
        interfaceC11756a.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initView() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentCreateSavingsBinding $r2 = (FragmentCreateSavingsBinding) $r1;
        KudiInputField $r3 = $r2.kiDuration;
        Log_OC.loadImage($r3, "kiDuration");
        CreateSavingsFragment$initView$1$1 r8 = new CreateSavingsFragment$initView$1$1(this);
        disableField($r3, r8);
        KudiInputField $r32 = $r2.kiStartDate;
        Log_OC.loadImage($r32, "kiStartDate");
        CreateSavingsFragment$initView$1$2 r9 = new CreateSavingsFragment$initView$1$2(this, $r2);
        disableField($r32, r9);
        ViewGroup $r6 = $r2.startButton;
        ViewGroup r11 = $r6;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.TextCandidatesViewManager$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateSavingsFragment $r22 = CreateSavingsFragment.this;
                CreateSavingsFragment.m40524initView$lambda7$lambda6($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-7$lambda-6  reason: not valid java name */
    public static final void m40524initView$lambda7$lambda6(CreateSavingsFragment createSavingsFragment, View view) {
        Log_OC.getArray(createSavingsFragment, "this$0");
        createSavingsFragment.prepareSavings();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Boolean isRadioButtonChecked() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentCreateSavingsBinding $r2 = (FragmentCreateSavingsBinding) $r1;
        RadioGroup $r3 = $r2.rgLockSaving;
        int $i0 = $r3.getCheckedRadioButtonId();
        if ($i0 == -1) {
            return null;
        }
        RadioButton $r4 = $r2.rbNo;
        RadioButton r6 = $r4;
        boolean $z0 = r6.isChecked();
        if ($z0) {
            Boolean r5 = Boolean.FALSE;
            return r5;
        }
        RadioButton $r42 = $r2.rbYes;
        RadioButton r62 = $r42;
        boolean $z02 = r62.isChecked();
        if ($z02) {
            Boolean r52 = Boolean.TRUE;
            return r52;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void launchDatePicker(final KudiInputField kudiInputField) {
        ContextExtKt.hideKeyboard(this);
        DatePickerFragment.Companion $r2 = DatePickerFragment.Companion;
        DatePickerFragment $r3 = DatePickerFragment.Companion.newInstance$default($r2, false, null, true, 3, null);
        FragmentManager $r4 = getChildFragmentManager();
        $r4.p1(DatePickerFragment.DATE_SET_KEY, this, new InterfaceC1523w() { // from class: ai.kudi.agent.savings.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38476c(String str, Bundle bundle) {
                KudiInputField $r32 = KudiInputField.this;
                CreateSavingsFragment.m40525launchDatePicker$lambda11($r32, str, bundle);
            }
        });
        FragmentManager $r42 = getChildFragmentManager();
        $r3.show($r42, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: launchDatePicker$lambda-11  reason: not valid java name */
    public static final void m40525launchDatePicker$lambda11(KudiInputField kudiInputField, String str, Bundle bundle) {
        Log_OC.getArray(kudiInputField, "$kudiInputField");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r5;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat($r4, "yyyy/MM/dd");
            kudiInputField.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final CreateSavingsFragment newInstance() {
        Companion $r1 = Companion;
        CreateSavingsFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void prepareSavings() {
        ContextExtKt.hideKeyboard(this);
        InterfaceC8209a $r2 = requireBinding();
        FragmentCreateSavingsBinding $r3 = (FragmentCreateSavingsBinding) $r2;
        KudiInputField $r4 = $r3.kiSavingName;
        String $r5 = $r4.getText();
        KudiInputField $r42 = $r3.kiAmount;
        String $r6 = $r42.getText();
        KudiInputField $r43 = $r3.kiStartDate;
        String $r7 = $r43.getText();
        KudiInputField $r44 = $r3.kiDuration;
        String $r8 = $r44.getText();
        Boolean $r9 = isRadioButtonChecked();
        CreateSavingsModel $r1 = new CreateSavingsModel($r5, SAVING_FREQUENCY, $r6, $r7, $r8, $r9, null, 64, null);
        CreateSavingsViewModel $r10 = getViewModel();
        $r10.validateFields($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDurationBottomSheet(List list) {
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        CreateSavingsFragment$showDurationBottomSheet$1 r5 = new CreateSavingsFragment$showDurationBottomSheet$1(list, this);
        Dialog r6 = new DialogC0809i($r3, r5);
        Dialog r7 = r6;
        r7.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void trackInteractions() {
        InterfaceC8209a $r1 = requireBinding();
        final FragmentCreateSavingsBinding $r2 = (FragmentCreateSavingsBinding) $r1;
        RadioButton $r3 = $r2.rbYes;
        RadioButton r17 = $r3;
        boolean $z0 = r17.isChecked();
        if ($z0) {
            Analytics $r4 = getAnalytics();
            $r4.lockOptionSelected("true");
        }
        RadioButton $r32 = $r2.rbNo;
        RadioButton r172 = $r32;
        boolean $z02 = r172.isChecked();
        if ($z02) {
            Analytics $r42 = getAnalytics();
            $r42.lockOptionSelected("false");
        }
        KudiInputField $r5 = $r2.kiStartDate;
        EditText $r6 = $r5.getInputEditText();
        $r6.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.savings.ui.CreateSavingsFragment$trackInteractions$lambda-5$$inlined$doAfterTextChanged$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CreateSavingsFragment $r22 = CreateSavingsFragment.this;
                Analytics $r33 = $r22.getAnalytics();
                String $r43 = String.valueOf(editable);
                $r33.savingsDateSelected($r43);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KudiInputField $r52 = $r2.kiDuration;
        EditText $r62 = $r52.getInputEditText();
        $r62.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.savings.ui.CreateSavingsFragment$trackInteractions$lambda-5$$inlined$doAfterTextChanged$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CreateSavingsFragment $r22 = CreateSavingsFragment.this;
                Analytics $r33 = $r22.getAnalytics();
                String $r43 = String.valueOf(editable);
                $r33.savingsDurationSelected($r43);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        KudiInputField $r53 = $r2.kiAmount;
        EditText $r63 = $r53.getInputEditText();
        $r63.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.savings.ui.CreateSavingsFragment$trackInteractions$lambda-5$$inlined$doAfterTextChanged$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String $r22 = String.valueOf(editable);
                int $i0 = Integer.parseInt($r22);
                if ($i0 < 200) {
                    FragmentCreateSavingsBinding $r33 = FragmentCreateSavingsBinding.this;
                    KudiInputField $r43 = $r33.kiAmount;
                    CreateSavingsFragment $r54 = this;
                    int $i02 = C0456R.string.minimum_saving_amount;
                    String $r23 = $r54.getString($i02);
                    $r43.setError($r23);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        final C11812w r15 = new C11812w();
        KudiInputField $r54 = $r2.kiSavingName;
        EditText $r64 = $r54.getInputEditText();
        $r64.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.savings.ui.CreateSavingsFragment$trackInteractions$lambda-5$$inlined$doAfterTextChanged$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Type inference failed for: r2v1, types: [android.os.CountDownTimer, T] */
            @Override // android.text.TextWatcher
            public void afterTextChanged(final Editable editable) {
                C11812w $r55 = C11812w.this;
                Object $r65 = $r55.f26499c;
                CountDownTimer $r33 = (CountDownTimer) $r65;
                if ($r33 != null) {
                    $r33.cancel();
                }
                C11812w $r56 = C11812w.this;
                final CreateSavingsFragment $r22 = this;
                $r56.f26499c = new CountDownTimer() { // from class: ai.kudi.agent.savings.ui.CreateSavingsFragment$trackInteractions$1$4$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1000L, 5000L);
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.os.CountDownTimer
                    public void onFinish() {
                        CreateSavingsFragment $r12 = CreateSavingsFragment.this;
                        Analytics $r23 = $r12.getAnalytics();
                        Editable $r34 = editable;
                        String $r43 = String.valueOf($r34);
                        $r23.onSavingsGoalEntered($r43);
                    }

                    @Override // android.os.CountDownTimer
                    public void onTick(long j) {
                    }
                }.start();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CreateSavingsViewData $r2 = (CreateSavingsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(CreateSavingsViewData createSavingsViewData) {
        Log_OC.getArray(createSavingsViewData, "viewData");
        boolean $z0 = createSavingsViewData instanceof CreateSavingsViewData.Error;
        if (!$z0) {
            boolean $z02 = createSavingsViewData instanceof CreateSavingsViewData.IsValidParams;
            if ($z02) {
                CreateSavingsViewModel $r8 = getViewModel();
                CreateSavingsViewData.IsValidParams $r9 = (CreateSavingsViewData.IsValidParams) createSavingsViewData;
                CreateSavingsModel $r10 = $r9.getSavingsModel();
                $r8.navigateToReview($r10);
                return;
            }
            boolean $z03 = createSavingsViewData instanceof CreateSavingsViewData.ShowProgress;
            if ($z03) {
                CreateSavingsViewModel $r82 = getViewModel();
                CreateSavingsViewData.ShowProgress $r11 = (CreateSavingsViewData.ShowProgress) createSavingsViewData;
                boolean $z04 = $r11.getVisibility();
                $r82.toggleProgress($z04);
                return;
            }
            boolean $z05 = createSavingsViewData instanceof CreateSavingsViewData.Duration;
            if ($z05) {
                CreateSavingsViewData.Duration $r12 = (CreateSavingsViewData.Duration) createSavingsViewData;
                List $r13 = $r12.getPlanDuration();
                this.durationList = $r13;
                return;
            }
            return;
        }
        InterfaceC8209a $r2 = requireBinding();
        FragmentCreateSavingsBinding $r3 = (FragmentCreateSavingsBinding) $r2;
        CreateSavingsViewData.Error $r4 = (CreateSavingsViewData.Error) createSavingsViewData;
        String $r5 = $r4.getAmountError();
        if ($r5 != null) {
            KudiInputField $r6 = $r3.kiAmount;
            $r6.setError($r5);
        }
        String $r52 = $r4.getDurationError();
        if ($r52 != null) {
            KudiInputField $r62 = $r3.kiDuration;
            $r62.setError($r52);
        }
        String $r53 = $r4.getNameError();
        if ($r53 != null) {
            KudiInputField $r63 = $r3.kiSavingName;
            $r63.setError($r53);
        }
        String $r54 = $r4.getStartDateError();
        if ($r54 != null) {
            KudiInputField $r64 = $r3.kiStartDate;
            $r64.setError($r54);
        }
        String $r55 = $r4.getLockError();
        if ($r55 == null) {
            return;
        }
        FragmentActivity $r7 = requireActivity();
        Log_OC.loadImage($r7, "requireActivity()");
        ContextExtKt.toast$default($r7, $r55, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CreateSavingsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CreateSavingsViewModel createViewModel() {
        CreateSavingsViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CreateSavingsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final CreateSavingsViewModel getViewModel() {
        CreateSavingsViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentCreateSavingsBinding $r4 = FragmentCreateSavingsBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                layoutInflater, container, false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r7;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            int $i0 = C0456R.string.create_savings;
            String $r6 = getString($i0);
            $r5.mo37631C($r6);
        }
        initView();
        trackInteractions();
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setViewModel(CreateSavingsViewModel createSavingsViewModel) {
        Log_OC.getArray(createSavingsViewModel, "<set-?>");
        this.viewModel = createSavingsViewModel;
    }
}
