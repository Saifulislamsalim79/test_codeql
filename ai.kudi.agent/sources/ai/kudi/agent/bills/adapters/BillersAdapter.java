package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter;
import ai.kudi.agent.bills.base.MerchantsOrBillers;
import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.C0038R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: BIllersAdapter.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/BillersAdapter;", "Lai/kudi/agent/bills/adapters/base/BaseMerchantAndBillerSearchAdapter;", "Lai/kudi/agent/bills/data/Biller;", "billers", "", "billerMode", "Lai/kudi/agent/bills/adapters/Mode;", "clickedListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lai/kudi/agent/bills/adapters/Mode;Lkotlin/jvm/functions/Function1;)V", "getBillers", "()Ljava/util/List;", "getClickedListener", "()Lkotlin/jvm/functions/Function1;", "getSearchCriteria", "", "merchantOrBiller", "onBindViewHolder", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillersAdapter extends BaseMerchantAndBillerSearchAdapter<Biller> {
    private final List<Biller> billers;
    private final InterfaceC11767l<Biller, C13666w> clickedListener;

    /* compiled from: BIllersAdapter.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Mode[] $r0 = Mode.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            Mode $r2 = Mode.BILLS;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            Mode $r22 = Mode.HOME;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillersAdapter(List list, Mode mode, InterfaceC11767l interfaceC11767l) {
        super(list, mode);
        Log_OC.getArray(list, "billers");
        Log_OC.getArray(mode, "billerMode");
        Log_OC.getArray(interfaceC11767l, "clickedListener");
        this.billers = list;
        this.clickedListener = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BillersAdapter(java.util.List r1, ai.kudi.agent.bills.adapters.Mode r2, kotlin.p483e0.p484c.InterfaceC11767l r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L6
            ai.kudi.agent.bills.adapters.Mode r2 = ai.kudi.agent.bills.adapters.Mode.BILLS
        L6:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.adapters.BillersAdapter.<init>(java.util.List, ai.kudi.agent.bills.adapters.Mode, kotlin.e0.c.l, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBillers() {
        List r1 = this.billers;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getClickedListener() {
        InterfaceC11767l r1 = this.clickedListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter
    public /* bridge */ /* synthetic */ List getSearchCriteria(MerchantsOrBillers merchantsOrBillers) {
        Biller $r3 = (Biller) merchantsOrBillers;
        List $r1 = getSearchCriteria($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public List getSearchCriteria(Biller biller) {
        List $r4;
        Log_OC.getArray(biller, "merchantOrBiller");
        String $r3 = biller.getName();
        String $r32 = biller.getLookupId();
        String[] $r2 = {$r3, $r32};
        $r4 = C13726r.m3888h($r2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        Log_OC.getArray(abstractC1620e0, "holder");
        boolean $z0 = abstractC1620e0 instanceof BillerViewHolder;
        if ($z0) {
            BillerViewHolder $r2 = (BillerViewHolder) abstractC1620e0;
            List $r3 = getSearchableList();
            Object $r4 = $r3.get(i);
            Biller $r5 = (Biller) $r4;
            $r2.setMerchantOrBiller($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int $i0;
        Log_OC.getArray(viewGroup, "parent");
        Mode $r2 = getMode();
        int[] $r3 = WhenMappings.$EnumSwitchMapping$0;
        int $i02 = $r3[$r2.ordinal()];
        if ($i02 == 1) {
            $i0 = C0038R.C0041layout.include_bill_item;
        } else if ($i02 != 2) {
            Throwable r10 = new NoWhenBranchMatchedException();
            Throwable r13 = r10;
            throw r13;
        } else {
            $i0 = C0038R.C0041layout.view_home_bill_item;
        }
        LayoutInflater $r6 = LayoutInflater.from(viewGroup.getContext());
        View $r7 = $r6.inflate($i0, viewGroup, false);
        Context $r5 = viewGroup.getContext();
        Log_OC.loadImage($r5, "parent.context");
        Log_OC.loadImage($r7, "view");
        BillersAdapter$onCreateViewHolder$1 r11 = new BillersAdapter$onCreateViewHolder$1(this);
        BillerViewHolder r12 = new BillerViewHolder($r5, $r7, r11);
        return r12;
    }
}
