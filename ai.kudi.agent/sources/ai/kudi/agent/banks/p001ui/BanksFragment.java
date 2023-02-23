package ai.kudi.agent.banks.p001ui;

import ai.kudi.agent.banks.p001ui.BanksViewData;
import ai.kudi.agent.banks.p001ui.adapter.BanksAdapter;
import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.databinding.SelectBankLayoutBinding;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: BanksFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001@B\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u001cH\u0002J\u0019\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0096\u0001J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0003H\u0016J\u0012\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J$\u00101\u001a\u00020&2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010<\u001a\u00020\u001cH\u0002J\t\u0010=\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010>\u001a\u00020\u001c2\b\u0010?\u001a\u0004\u0018\u00010\bH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006A"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/banks/ui/adapter/BanksAdapter$BankAdapterClickListener;", "Lai/kudi/agent/core/domain/room_entities/Bank;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/core/databinding/SelectBankLayoutBinding;", "()V", BanksFragment.ARGS_BANK_CODE, "", "getBankCode", "()Ljava/lang/String;", "setBankCode", "(Ljava/lang/String;)V", "banksAdapter", "Lai/kudi/agent/banks/ui/adapter/BanksAdapter;", "banksViewModel", "Lai/kudi/agent/banks/ui/BanksViewModel;", "getBanksViewModel", "()Lai/kudi/agent/banks/ui/BanksViewModel;", "setBanksViewModel", "(Lai/kudi/agent/banks/ui/BanksViewModel;)V", "binding", "getBinding", "()Lai/kudi/agent/core/databinding/SelectBankLayoutBinding;", "disposable", "Lio/reactivex/disposables/Disposable;", "onBankSelectedListener", "Lkotlin/Function1;", "", "getOnBankSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnBankSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "applyViewData", "viewData", "Lai/kudi/agent/banks/ui/BanksViewData;", "handleBackButton", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onBankSelected", "bank", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "performSearch", "requireBinding", "search", "s", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.banks.ui.BanksFragment */
/* loaded from: classes.dex */
public final class BanksFragment extends h implements BanksAdapter.BankAdapterClickListener<Bank>, BaseViewBinder<SelectBankLayoutBinding> {
    private static final String ARGS_BANK_CODE = "bankCode";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<SelectBankLayoutBinding> $$delegate_0;
    private String bankCode;
    private BanksAdapter<Bank> banksAdapter;
    public BanksViewModel banksViewModel;
    private FavoritesArrayAdapter disposable;
    private InterfaceC11767l<? super Bank, C13666w> onBankSelectedListener;

    /* compiled from: BanksFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksFragment$Companion;", "", "()V", "ARGS_BANK_CODE", "", "newInstance", "Lai/kudi/agent/banks/ui/BanksFragment;", BanksFragment.ARGS_BANK_CODE, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.banks.ui.BanksFragment$Companion */
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
        public final BanksFragment newInstance(String str) {
            BanksFragment $r2 = new BanksFragment();
            Bundle $r3 = new Bundle();
            $r3.putString(BanksFragment.ARGS_BANK_CODE, str);
            $r2.setArguments($r3);
            return $r2;
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
    public BanksFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBackButton() {
        SelectBankLayoutBinding $r2 = requireBinding();
        ImageView $r3 = $r2.backButton;
        $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.banks.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BanksFragment $r22 = BanksFragment.this;
                BanksFragment.m39008handleBackButton$lambda2($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBackButton$lambda-2  reason: not valid java name */
    public static final void m39008handleBackButton$lambda2(BanksFragment banksFragment, View view) {
        Log_OC.getArray(banksFragment, "this$0");
        ContextExtKt.hideKeyboard(banksFragment);
        banksFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39009onViewCreated$lambda0(BanksFragment banksFragment, BanksViewData banksViewData) {
        Log_OC.getArray(banksFragment, "this$0");
        Log_OC.loadImage(banksViewData, "it");
        banksFragment.applyViewData(banksViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        SelectBankLayoutBinding $r2 = requireBinding();
        EditText $r3 = $r2.searchView;
        $r3.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.banks.ui.BanksFragment$performSearch$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                BanksFragment $r32 = BanksFragment.this;
                String $r1 = String.valueOf(charSequence);
                $r32.search($r1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void search(String str) {
        BanksAdapter $r2 = this.banksAdapter;
        if ($r2 == null) {
            return;
        }
        BanksFragment$search$1 $r3 = new BanksFragment$search$1(this);
        $r2.search(str, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void applyViewData(BanksViewData banksViewData) {
        List $r8;
        Log_OC.getArray(banksViewData, "viewData");
        SelectBankLayoutBinding $r2 = requireBinding();
        boolean $z0 = banksViewData instanceof BanksViewData.IsLoading;
        if ($z0) {
            ProgressBar $r3 = $r2.banksProgressBar;
            Log_OC.loadImage($r3, "banksProgressBar");
            ViewExtKt.show($r3);
            return;
        }
        boolean $z02 = banksViewData instanceof BanksViewData.Banks;
        if (!$z02) {
            boolean $z03 = banksViewData instanceof BanksViewData.Error;
            if ($z03) {
                Context $r6 = requireContext();
                Log_OC.loadImage($r6, "requireContext()");
                BanksViewData.Error $r11 = (BanksViewData.Error) banksViewData;
                String $r4 = $r11.getMessage();
                ContextExtKt.toast$default($r6, $r4, 0, 2, (Object) null);
                return;
            }
            return;
        }
        ProgressBar $r32 = $r2.banksProgressBar;
        Log_OC.loadImage($r32, "banksProgressBar");
        ViewExtKt.hide$default($r32, false, 1, null);
        Context $r62 = requireContext();
        Log_OC.loadImage($r62, "requireContext()");
        BanksViewData.Banks $r7 = (BanksViewData.Banks) banksViewData;
        List $r82 = $r7.getBanks();
        $r8 = C13742z.m3823D0($r82);
        Bundle $r9 = getArguments();
        String $r42 = $r9 != null ? $r9.getString(ARGS_BANK_CODE) : null;
        BanksAdapter $r5 = new BanksAdapter($r62, $r8, this, $r42);
        this.banksAdapter = $r5;
        RecyclerView $r10 = $r2.recyclerView;
        $r10.setAdapter($r5);
        performSearch();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBankCode() {
        String r1 = this.bankCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BanksViewModel getBanksViewModel() {
        BanksViewModel $r1 = this.banksViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("banksViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SelectBankLayoutBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        SelectBankLayoutBinding $r3 = (SelectBankLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        SelectBankLayoutBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnBankSelectedListener() {
        InterfaceC11767l r1 = this.onBankSelectedListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(SelectBankLayoutBinding selectBankLayoutBinding, Fragment fragment) {
        Log_OC.getArray(selectBankLayoutBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(selectBankLayoutBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        SelectBankLayoutBinding $r4 = (SelectBankLayoutBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBankSelected(Bank bank) {
        Log_OC.getArray(bank, "bank");
        ContextExtKt.hideKeyboard(this);
        InterfaceC11767l $r2 = this.onBankSelectedListener;
        if ($r2 == null) {
            return;
        }
        $r2.invoke(bank);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.banks.p001ui.adapter.BanksAdapter.BankAdapterClickListener
    public /* bridge */ /* synthetic */ void onBankSelected(Object obj) {
        Bank $r2 = (Bank) obj;
        onBankSelected($r2);
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
        SelectBankLayoutBinding $r4 = SelectBankLayoutBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDestroy() {
        super.onDestroy();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDismiss(DialogInterface dialogInterface) {
        Log_OC.getArray(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        FavoritesArrayAdapter $r2 = this.disposable;
        if ($r2 == null) {
            return;
        }
        $r2.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        SelectBankLayoutBinding $r3 = requireBinding();
        RecyclerView $r4 = $r3.recyclerView;
        Context $r6 = requireContext();
        LinearLayoutManager $r5 = new LinearLayoutManager($r6);
        $r4.setLayoutManager($r5);
        handleBackButton();
        BanksViewModel $r7 = getBanksViewModel();
        C11680b $r8 = $r7.getBanksViewData();
        FavoritesArrayAdapter $r9 = null;
        if ($r8 != null) {
            PreferenceActivity $r10 = getViewLifecycleOwner();
            Log_OC.loadImage($r10, "viewLifecycleOwner");
            AbstractC11688p $r11 = C7390a.a($r8, $r10);
            if ($r11 != null) {
                Object object = new Object() { // from class: ai.kudi.agent.banks.ui.Logger
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        BanksFragment $r1 = BanksFragment.this;
                        BanksViewData $r32 = (BanksViewData) obj;
                        BanksFragment.m39009onViewCreated$lambda0($r1, $r32);
                    }
                };
                Constants $r13 = Constants.INSTANCE;
                $r9 = $r11.e0(object, $r13);
            }
        }
        this.disposable = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SelectBankLayoutBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        SelectBankLayoutBinding $r3 = (SelectBankLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        SelectBankLayoutBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setBankCode(String str) {
        this.bankCode = str;
    }

    public final void setBanksViewModel(BanksViewModel banksViewModel) {
        Log_OC.getArray(banksViewModel, "<set-?>");
        this.banksViewModel = banksViewModel;
    }

    public final void setOnBankSelectedListener(InterfaceC11767l interfaceC11767l) {
        this.onBankSelectedListener = interfaceC11767l;
    }
}
