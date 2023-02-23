package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.bills.adapters.base.MerchantsAndBillersBaseSectionAdapter;
import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.core.C0038R;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BillerSectionAdapter.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BZ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R,\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/BillerSectionAdapter;", "Lai/kudi/agent/bills/adapters/base/MerchantsAndBillersBaseSectionAdapter;", "Lai/kudi/agent/bills/data/Biller;", "billerContext", "Landroid/content/Context;", "billerTitle", "", "billers", "", "itemClickedListener", "Lkotlin/Function1;", "", "clickListener", "Lkotlin/ParameterName;", "name", "section", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBillerTitle", "()Ljava/lang/String;", "getBillers", "()Ljava/util/List;", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getItemClickedListener", "getItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "onBindHeaderViewHolder", "holder", "onBindItemViewHolder", "position", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillerSectionAdapter extends MerchantsAndBillersBaseSectionAdapter<Biller> {
    private final String billerTitle;
    private final List<Biller> billers;
    private final InterfaceC11767l<BillerSectionAdapter, C13666w> clickListener;
    private final InterfaceC11767l<Biller, C13666w> itemClickedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillerSectionAdapter(Context context, String str, List list, InterfaceC11767l interfaceC11767l, InterfaceC11767l interfaceC11767l2) {
        super(context, str, list);
        Log_OC.getArray(context, "billerContext");
        Log_OC.getArray(str, "billerTitle");
        Log_OC.getArray(list, "billers");
        Log_OC.getArray(interfaceC11767l, "itemClickedListener");
        Log_OC.getArray(interfaceC11767l2, "clickListener");
        this.billerTitle = str;
        this.billers = list;
        this.itemClickedListener = interfaceC11767l;
        this.clickListener = interfaceC11767l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindHeaderViewHolder$lambda-0  reason: not valid java name */
    public static final void m39017onBindHeaderViewHolder$lambda0(BillerSectionAdapter billerSectionAdapter, View view) {
        Log_OC.getArray(billerSectionAdapter, "this$0");
        InterfaceC11767l $r1 = billerSectionAdapter.getClickListener();
        $r1.invoke(billerSectionAdapter);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBillerTitle() {
        String r1 = this.billerTitle;
        return r1;
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
    public final InterfaceC11767l getClickListener() {
        InterfaceC11767l r1 = this.clickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getItemClickedListener() {
        InterfaceC11767l r1 = this.itemClickedListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p426a.p427a.p428a.AbstractC11119a
    public RecyclerView.AbstractC1620e0 getItemViewHolder(View view) {
        Log_OC.getArray(view, "view");
        Context $r3 = getContext();
        BillerSectionAdapter$getItemViewHolder$1 $r2 = new BillerSectionAdapter$getItemViewHolder$1(this);
        BillerViewHolder $r4 = new BillerViewHolder($r3, view, $r2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p426a.p427a.p428a.AbstractC11119a
    public void onBindHeaderViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        Log_OC.getArray(abstractC1620e0, "holder");
        MerchantsAndBillersHeaderViewHolder $r2 = (MerchantsAndBillersHeaderViewHolder) abstractC1620e0;
        TextView $r3 = $r2.getTitle();
        String $r4 = getTitle();
        $r3.setText($r4);
        ImageView $r5 = $r2.getImgArrow();
        boolean $z0 = getExpanded();
        int $i0 = $z0 ? C0038R.C0039drawable.bill_item_arrow_up : C0038R.C0039drawable.bill_list_item_arrow_down;
        $r5.setImageResource($i0);
        View $r6 = $r2.getRootView();
        $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.adapters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BillerSectionAdapter $r22 = BillerSectionAdapter.this;
                BillerSectionAdapter.m39017onBindHeaderViewHolder$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p426a.p427a.p428a.AbstractC11119a
    public void onBindItemViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        boolean $z0 = abstractC1620e0 instanceof BillerViewHolder;
        if ($z0) {
            BillerViewHolder $r3 = (BillerViewHolder) abstractC1620e0;
            List $r4 = this.billers;
            Object $r1 = $r4.get(i);
            Biller $r5 = (Biller) $r1;
            $r3.setMerchantOrBiller($r5);
        }
    }
}
