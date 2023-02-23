package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.SelectBankWithUssdLayoutBinding;
import ai.kudi.agent.transfer.adapter.BanksAdapter;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BanksWithUssdCodesPicker.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001-B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0003H\u0016J\u0012\u0010#\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u0014H\u0002J\t\u0010*\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\bH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006."}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/BanksWithUssdCodesPicker;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/transfer/adapter/BanksAdapter$BankAdapterClickListener;", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/SelectBankWithUssdLayoutBinding;", "()V", BanksWithUssdCodesPicker.ARGS_BANK_CODE, "", "getBankCode", "()Ljava/lang/String;", "setBankCode", "(Ljava/lang/String;)V", "banksAdapter", "Lai/kudi/agent/transfer/adapter/BanksAdapter;", "binding", "getBinding", "()Lai/kudi/agent/databinding/SelectBankWithUssdLayoutBinding;", "onBankSelectedListener", "Lkotlin/Function1;", "", "getOnBankSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnBankSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "handleBackButton", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBankSelected", "bank", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "performSearch", "requireBinding", "search", "s", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BanksWithUssdCodesPicker extends h implements BanksAdapter.BankAdapterClickListener<MonnifyDetails.BankData>, BaseViewBinder<SelectBankWithUssdLayoutBinding> {
    private static final String ARGS_BANKS = "args_banks";
    private static final String ARGS_BANK_CODE = "bankCode";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<SelectBankWithUssdLayoutBinding> $$delegate_0;
    private String bankCode;
    private BanksAdapter<MonnifyDetails.BankData> banksAdapter;
    private InterfaceC11767l<? super MonnifyDetails.BankData, C13666w> onBankSelectedListener;

    /* compiled from: BanksWithUssdCodesPicker.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/wallettopup/fragments/BanksWithUssdCodesPicker$Companion;", "", "()V", "ARGS_BANKS", "", "ARGS_BANK_CODE", "newInstance", "Lai/kudi/agent/wallettopup/fragments/BanksWithUssdCodesPicker;", TransactionBreakDownItemType.DATA, "Ljava/util/ArrayList;", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;", "Lkotlin/collections/ArrayList;", BanksWithUssdCodesPicker.ARGS_BANK_CODE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public static /* synthetic */ BanksWithUssdCodesPicker newInstance$default(Companion companion, ArrayList arrayList, String $r4, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r4 = null;
            }
            BanksWithUssdCodesPicker $r2 = companion.newInstance(arrayList, $r4);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BanksWithUssdCodesPicker newInstance(ArrayList arrayList, String str) {
            Log_OC.getArray(arrayList, TransactionBreakDownItemType.DATA);
            BanksWithUssdCodesPicker $r4 = new BanksWithUssdCodesPicker();
            Bundle $r2 = new Bundle();
            $r2.putString(BanksWithUssdCodesPicker.ARGS_BANK_CODE, str);
            $r2.putParcelableArrayList(BanksWithUssdCodesPicker.ARGS_BANKS, arrayList);
            $r4.setArguments($r2);
            return $r4;
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
    public BanksWithUssdCodesPicker() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBackButton() {
        SelectBankWithUssdLayoutBinding $r2 = requireBinding();
        ImageView $r3 = $r2.backButton;
        $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.fragments.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BanksWithUssdCodesPicker $r22 = BanksWithUssdCodesPicker.this;
                BanksWithUssdCodesPicker.m41753handleBackButton$lambda0($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBackButton$lambda-0  reason: not valid java name */
    public static final void m41753handleBackButton$lambda0(BanksWithUssdCodesPicker banksWithUssdCodesPicker, View view) {
        Log_OC.getArray(banksWithUssdCodesPicker, "this$0");
        banksWithUssdCodesPicker.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performSearch() {
        SelectBankWithUssdLayoutBinding $r2 = requireBinding();
        EditText $r3 = $r2.searchView;
        $r3.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.wallettopup.fragments.BanksWithUssdCodesPicker$performSearch$1
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
                BanksWithUssdCodesPicker $r32 = BanksWithUssdCodesPicker.this;
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
        BanksAdapter $r1 = this.banksAdapter;
        if ($r1 != null) {
            BanksWithUssdCodesPicker$search$1 $r2 = new BanksWithUssdCodesPicker$search$1(this);
            $r1.search(str, $r2);
            return;
        }
        Log_OC.LogError("banksAdapter");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
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
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SelectBankWithUssdLayoutBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        SelectBankWithUssdLayoutBinding $r3 = (SelectBankWithUssdLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        SelectBankWithUssdLayoutBinding $r1 = getBinding();
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
    public View initBinding(SelectBankWithUssdLayoutBinding selectBankWithUssdLayoutBinding, Fragment fragment) {
        Log_OC.getArray(selectBankWithUssdLayoutBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(selectBankWithUssdLayoutBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        SelectBankWithUssdLayoutBinding $r4 = (SelectBankWithUssdLayoutBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onActivityCreated(Bundle bundle) {
        List $r8;
        super.onActivityCreated(bundle);
        SelectBankWithUssdLayoutBinding $r2 = requireBinding();
        RecyclerView $r3 = $r2.mRecyclerView;
        Log_OC.loadImage($r3, "requireBinding().rv");
        LinearLayoutManager $r4 = new LinearLayoutManager(requireContext());
        $r3.setLayoutManager($r4);
        Bundle $r1 = getArguments();
        ArrayList $r6 = $r1 == null ? null : $r1.getParcelableArrayList(ARGS_BANKS);
        Context $r5 = requireContext();
        Log_OC.loadImage($r5, "requireContext()");
        Log_OC.append($r6);
        $r8 = C13742z.m3823D0($r6);
        Bundle $r12 = getArguments();
        String $r9 = $r12 == null ? null : $r12.getString(ARGS_BANK_CODE);
        BanksAdapter $r7 = new BanksAdapter($r5, $r8, this, $r9);
        this.banksAdapter = $r7;
        if ($r7 == null) {
            Log_OC.LogError("banksAdapter");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        $r3.setAdapter($r7);
        performSearch();
        handleBackButton();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBankSelected(MonnifyDetails.BankData bankData) {
        Log_OC.getArray(bankData, "bank");
        InterfaceC11767l $r2 = this.onBankSelectedListener;
        Log_OC.append($r2);
        $r2.invoke(bankData);
        dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.adapter.BanksAdapter.BankAdapterClickListener
    public /* bridge */ /* synthetic */ void onBankSelected(Object obj) {
        MonnifyDetails.BankData $r2 = (MonnifyDetails.BankData) obj;
        onBankSelected($r2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C0001R.style.FullScreenDialogStyle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        SelectBankWithUssdLayoutBinding $r4 = SelectBankWithUssdLayoutBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public SelectBankWithUssdLayoutBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        SelectBankWithUssdLayoutBinding $r3 = (SelectBankWithUssdLayoutBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        SelectBankWithUssdLayoutBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setBankCode(String str) {
        this.bankCode = str;
    }

    public final void setOnBankSelectedListener(InterfaceC11767l interfaceC11767l) {
        this.onBankSelectedListener = interfaceC11767l;
    }
}
