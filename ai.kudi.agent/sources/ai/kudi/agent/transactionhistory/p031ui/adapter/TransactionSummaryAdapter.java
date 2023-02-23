package ai.kudi.agent.transactionhistory.p031ui.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.AbstractC1904a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionSummaryAdapter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/adapter/TransactionSummaryAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "summaryItems", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "onItemClickListener", "Lkotlin/Function1;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "getPageWidth", "", "instantiateItem", "isViewFromObject", "", "Landroid/view/View;", "object", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.adapter.TransactionSummaryAdapter */
/* loaded from: classes.dex */
public final class TransactionSummaryAdapter extends AbstractC1904a {
    private final Context context;
    private final InterfaceC11767l<TransactionSummaryItem, C13666w> onItemClickListener;
    private final List<TransactionSummaryItem> summaryItems;

    public TransactionSummaryAdapter(Context context, List list, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "summaryItems");
        Log_OC.getArray(interfaceC11767l, "onItemClickListener");
        this.context = context;
        this.summaryItems = list;
        this.onItemClickListener = interfaceC11767l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: instantiateItem$lambda-0  reason: not valid java name */
    public static final void m41061instantiateItem$lambda0(TransactionSummaryAdapter transactionSummaryAdapter, TransactionSummaryItem transactionSummaryItem, View view) {
        Log_OC.getArray(transactionSummaryAdapter, "this$0");
        Log_OC.getArray(transactionSummaryItem, "$item");
        InterfaceC11767l $r3 = transactionSummaryAdapter.onItemClickListener;
        $r3.invoke(transactionSummaryItem);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Log_OC.getArray(viewGroup, "container");
        Log_OC.getArray(obj, "view");
        View $r3 = (View) obj;
        viewGroup.removeView($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public int getCount() {
        List $r1 = this.summaryItems;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public float getPageWidth(int i) {
        List $r1 = this.summaryItems;
        int $i0 = $r1.size();
        return $i0 == 1 ? 1.0f : 0.7f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager.widget.AbstractC1904a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "container");
        Context $r2 = this.context;
        LayoutInflater $r3 = LayoutInflater.from($r2);
        View $r4 = $r3.inflate(C0001R.C0004layout.list_item_transaction_summary, viewGroup, false);
        List $r5 = this.summaryItems;
        Object $r6 = $r5.get(i);
        final TransactionSummaryItem $r7 = (TransactionSummaryItem) $r6;
        View $r8 = $r4.findViewById(C0001R.C0003id.summary_label);
        TextView $r9 = (TextView) $r8;
        TransactionSummaryItemType $r10 = $r7.getType();
        int $i0 = $r10.getLabelResId();
        $r9.setText($i0);
        View $r82 = $r4.findViewById(C0001R.C0003id.summary_value);
        TextView $r92 = (TextView) $r82;
        String $r11 = $r7.getValue();
        $r92.setText($r11);
        View $r83 = $r4.findViewById(C0001R.C0003id.summary_icon);
        ImageView $r12 = (ImageView) $r83;
        TransactionSummaryItemType $r102 = $r7.getType();
        int $i02 = $r102.getIconResId();
        $r12.setImageResource($i02);
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.adapter.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionSummaryAdapter $r22 = TransactionSummaryAdapter.this;
                TransactionSummaryItem $r32 = $r7;
                TransactionSummaryAdapter.m41061instantiateItem$lambda0($r22, $r32, view);
            }
        });
        viewGroup.addView($r4);
        Log_OC.loadImage($r4, "layout");
        return $r4;
    }

    @Override // androidx.viewpager.widget.AbstractC1904a
    public boolean isViewFromObject(View view, Object obj) {
        Log_OC.getArray(view, "view");
        Log_OC.getArray(obj, "object");
        return view == obj;
    }
}
