package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.databinding.SelectPosFragmentBinding;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.adapter.SelectPosAdapter;
import ai.kudi.agent.pos.p016ui.data.SelectPosTypeViewData;
import ai.kudi.agent.pos.p016ui.model.SelectPosType;
import ai.kudi.agent.pos.p016ui.utils.PosActivityExtKt;
import ai.kudi.agent.pos.p016ui.viewModels.SelectPosViewModel;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SelectPosFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/pos/ui/SelectPosFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/ui/viewModels/SelectPosViewModel;", "Lai/kudi/agent/pos/ui/data/SelectPosTypeViewData;", "Lai/kudi/agent/databinding/SelectPosFragmentBinding;", "()V", "adapter", "Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter;", "getAdapter", "()Lai/kudi/agent/pos/ui/adapter/SelectPosAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "position", "", "purchaseInfo", "", "Lai/kudi/agent/pos/data/PosTypeData;", "terminalList", "Lai/kudi/agent/pos/ui/model/SelectPosType;", "viewModel", "getViewModel", "()Lai/kudi/agent/pos/ui/viewModels/SelectPosViewModel;", "setViewModel", "(Lai/kudi/agent/pos/ui/viewModels/SelectPosViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.SelectPosFragment */
/* loaded from: classes.dex */
public final class SelectPosFragment extends BaseMVVMViewBindingFragment<SelectPosViewModel, SelectPosTypeViewData, SelectPosFragmentBinding> {
    public static final Companion Companion;
    private static final String LEASING_DATA = "leasingData";
    private static final int NO_SELECTION = -1;
    private final InterfaceC11824h adapter$delegate;
    private int position;
    private List<PosTypeData> purchaseInfo;
    private final List<SelectPosType> terminalList;
    public SelectPosViewModel viewModel;

    /* compiled from: SelectPosFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/pos/ui/SelectPosFragment$Companion;", "", "()V", "LEASING_DATA", "", "NO_SELECTION", "", "newInstance", "Lai/kudi/agent/pos/ui/SelectPosFragment;", "posList", "", "Lai/kudi/agent/pos/data/PosTypeData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.SelectPosFragment$Companion */
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
        public final SelectPosFragment newInstance(List list) {
            Log_OC.getArray(list, "posList");
            SelectPosFragment $r2 = new SelectPosFragment();
            ArrayList $r4 = new ArrayList(list);
            C13287o $r5 = C13664u.m4227a("leasingData", $r4);
            C13287o[] $r3 = {$r5};
            Bundle $r6 = C1372b.m36174a($r3);
            $r2.setArguments($r6);
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
    public SelectPosFragment() {
        InterfaceC11824h $r1;
        ArrayList $r2 = new ArrayList();
        this.terminalList = $r2;
        ArrayList $r22 = new ArrayList();
        this.purchaseInfo = $r22;
        this.position = -1;
        SelectPosFragment$adapter$2 $r3 = new SelectPosFragment$adapter$2(this);
        $r1 = C13218k.m5625b($r3);
        this.adapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final SelectPosAdapter getAdapter() {
        InterfaceC11824h $r2 = this.adapter$delegate;
        Object $r1 = $r2.getValue();
        SelectPosAdapter $r3 = (SelectPosAdapter) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3$lambda-1  reason: not valid java name */
    public static final void m40076onViewCreated$lambda3$lambda1(SelectPosFragment selectPosFragment, View view) {
        Log_OC.getArray(selectPosFragment, "this$0");
        int $i0 = selectPosFragment.position;
        if ($i0 == -1) {
            FragmentActivity $r3 = selectPosFragment.requireActivity();
            Log_OC.loadImage($r3, "requireActivity()");
            String $r4 = selectPosFragment.getString(C0001R.string.no_terminal_selected);
            ContextExtKt.toast$default($r3, $r4, 0, 2, (Object) null);
            return;
        }
        SelectPosViewModel $r5 = selectPosFragment.getViewModel();
        List $r6 = selectPosFragment.purchaseInfo;
        int $i02 = selectPosFragment.position;
        Object $r7 = $r6.get($i02);
        PosPurchaseInfo $r0 = new PosPurchaseInfo(null, null, null, null, (PosTypeData) $r7, 15, null);
        $r5.goToOrderDetailsFragment($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SelectPosTypeViewData $r2 = (SelectPosTypeViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SelectPosTypeViewData selectPosTypeViewData) {
        Log_OC.getArray(selectPosTypeViewData, "viewData");
        boolean $z0 = selectPosTypeViewData instanceof SelectPosTypeViewData.OnTerminalSelected;
        if ($z0) {
            SelectPosAdapter $r2 = getAdapter();
            SelectPosTypeViewData.OnTerminalSelected $r3 = (SelectPosTypeViewData.OnTerminalSelected) selectPosTypeViewData;
            List $r4 = $r3.getUpdatedList();
            $r2.submitList($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SelectPosViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SelectPosViewModel createViewModel() {
        SelectPosViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SelectPosViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SelectPosViewModel getViewModel() {
        SelectPosViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        PosSubComponent $r4;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof PosActivity;
        PosActivity $r3 = $z0 ? (PosActivity) $r2 : null;
        if ($r3 == null || ($r4 = $r3.getPos2SubComponent()) == null) {
            return;
        }
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        List $r7;
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        ArrayList $r3 = $r1.getParcelableArrayList("leasingData");
        if ($r3 == null) {
            NullPointerException $r13 = new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<ai.kudi.agent.pos.data.PosTypeData>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.kudi.agent.pos.data.PosTypeData> }");
            throw $r13;
        }
        this.purchaseInfo = $r3;
        List $r4 = this.terminalList;
        List $r72 = this.purchaseInfo;
        Object $r8 = C13722p.m3954R($r72);
        double $d0 = ((PosTypeData) $r8).getPrice();
        Double $r10 = Double.valueOf($d0);
        Object[] $r6 = {StringExtKt.formatAmount($r10)};
        String $r11 = getString(C0001R.string.nomba_lite_terminal, $r6);
        Log_OC.loadImage($r11, "getString(R.string.nomba_lite_terminal, purchaseInfo.first().price.formatAmount())");
        String $r12 = getString(C0001R.string.nomba_lite_terminal_desc);
        Log_OC.loadImage($r12, "getString(R.string.nomba_lite_terminal_desc)");
        SelectPosType $r2 = new SelectPosType($r11, $r12, false, C0001R.C0002drawable.img_nomba_lite_terminal, 4, null);
        List $r73 = this.purchaseInfo;
        Object $r82 = C13722p.m3943c0($r73);
        PosTypeData $r9 = (PosTypeData) $r82;
        double $d02 = $r9.getPrice();
        Double $r102 = Double.valueOf($d02);
        Object[] $r62 = {StringExtKt.formatAmount($r102)};
        String $r112 = getString(C0001R.string.nomba_pro_terminal, $r62);
        Log_OC.loadImage($r112, "getString(R.string.nomba_pro_terminal, purchaseInfo.last().price.formatAmount())");
        String $r122 = getString(C0001R.string.nomba_pro_terminal_desc);
        Log_OC.loadImage($r122, "getString(R.string.nomba_pro_terminal_desc)");
        SelectPosType $r22 = new SelectPosType($r112, $r122, false, C0001R.C0002drawable.img_nomba_pro_terminal, 4, null);
        SelectPosType[] $r5 = {$r2, $r22};
        $r7 = C13726r.m3888h($r5);
        $r4.addAll($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        SelectPosFragmentBinding $r4 = SelectPosFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        String $r4 = getString(C0001R.string.select_pos_type);
        Log_OC.loadImage($r4, "getString(R.string.select_pos_type)");
        PosActivityExtKt.setPosActivityTitle($r3, $r4);
        InterfaceC8209a $r5 = requireBinding();
        SelectPosFragmentBinding $r6 = (SelectPosFragmentBinding) $r5;
        ViewGroup $r7 = $r6.startButton;
        ViewGroup r14 = $r7;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.ActivityMain$17
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectPosFragment $r2 = SelectPosFragment.this;
                SelectPosFragment.m40076onViewCreated$lambda3$lambda1($r2, view2);
            }
        });
        RecyclerView $r9 = $r6.rvPosType;
        SelectPosAdapter $r10 = getAdapter();
        List $r11 = this.terminalList;
        $r10.submitList($r11);
        C13666w c13666w = C13666w.f30112a;
        $r9.setAdapter($r10);
    }

    public final void setViewModel(SelectPosViewModel selectPosViewModel) {
        Log_OC.getArray(selectPosViewModel, "<set-?>");
        this.viewModel = selectPosViewModel;
    }
}
