package ai.kudi.agent.bills.adapters.base;

import ai.kudi.agent.bills.adapters.Mode;
import ai.kudi.agent.bills.base.MerchantsOrBillers;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* compiled from: BaseMerchantAndBillerSearchAdapter.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\u0006\u0010%\u001a\u00028\u0000H&¢\u0006\u0002\u0010&JI\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010$2'\u0010\u001a\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000f0\u001b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010\u0010\u001a\"\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u00000\u0011j\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000`\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R1\u0010\u001a\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/base/BaseMerchantAndBillerSearchAdapter;", "MB", "Lai/kudi/agent/bills/base/MerchantsOrBillers;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "merchantsOrBillers", "", WalletTopUpActivity.EXTRA_MODE, "Lai/kudi/agent/bills/adapters/Mode;", "(Ljava/util/List;Lai/kudi/agent/bills/adapters/Mode;)V", "getMode", "()Lai/kudi/agent/bills/adapters/Mode;", "onNothingFound", "Lkotlin/Function0;", "", "originalList", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "getOriginalList", "()Ljava/util/ArrayList;", "searchableList", "", "getSearchableList", "()Ljava/util/List;", "somethingFound", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", AttributeType.LIST, "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "getSearchCriteria", "", "merchantOrBiller", "(Lai/kudi/agent/bills/base/MerchantsOrBillers;)Ljava/util/List;", "search", "s", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseMerchantAndBillerSearchAdapter<MB extends MerchantsOrBillers> extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> implements Filterable {
    private final Mode mode;
    private InterfaceC11756a<C13666w> onNothingFound;
    private final ArrayList<MB> originalList;
    private final List<MB> searchableList;
    private InterfaceC11767l<? super List<? extends MB>, C13666w> somethingFound;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMerchantAndBillerSearchAdapter(List list, Mode mode) {
        List $r1;
        Log_OC.getArray(list, "merchantsOrBillers");
        Log_OC.getArray(mode, WalletTopUpActivity.EXTRA_MODE);
        this.mode = mode;
        $r1 = C13742z.m3823D0(list);
        this.searchableList = $r1;
        List $r12 = this.searchableList;
        ArrayList $r3 = new ArrayList($r12);
        this.originalList = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BaseMerchantAndBillerSearchAdapter(java.util.List r1, ai.kudi.agent.bills.adapters.Mode r2, int r3, kotlin.p483e0.p485d.DBUtils$1 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            ai.kudi.agent.bills.adapters.Mode r2 = ai.kudi.agent.bills.adapters.Mode.BILLS
        L6:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.<init>(java.util.List, ai.kudi.agent.bills.adapters.Mode, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter$getFilter$1
            private final Filter.FilterResults filterResults;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                Filter.FilterResults $r2 = new Filter.FilterResults();
                this.filterResults = $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:16:0x0061 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
            @Override // android.widget.Filter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r17) {
                /*
                    r16 = this;
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r2.clear()
                    if (r17 == 0) goto L1a
                    r0 = r17
                    boolean r3 = kotlin.p549l0.C13265j.m5470u(r0)
                    if (r3 == 0) goto L18
                    goto L1a
                L18:
                    r3 = 0
                    goto L1b
                L1a:
                    r3 = 1
                L1b:
                    if (r3 == 0) goto L4f
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.ArrayList r4 = r1.getOriginalList()
                    r2.addAll(r4)
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    kotlin.e0.c.l r5 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.access$getSomethingFound$p(r1)
                    if (r5 != 0) goto L41
                    goto Lb6
                L41:
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r5.invoke(r2)
                    goto Lb6
                L4f:
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.ArrayList r4 = r1.getOriginalList()
                    java.util.Iterator r6 = r4.iterator()
                L5d:
                    boolean r3 = r6.hasNext()
                    if (r3 == 0) goto Lb6
                    java.lang.Object r7 = r6.next()
                    r9 = r7
                    ai.kudi.agent.bills.base.MerchantsOrBillers r9 = (ai.kudi.agent.bills.base.MerchantsOrBillers) r9
                    r8 = r9
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.lang.String r10 = "i"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r8, r10)
                    java.util.List r2 = r1.getSearchCriteria(r8)
                    r11 = 0
                    java.lang.Object r7 = r2.get(r11)
                    r13 = r7
                    java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                    r12 = r13
                    r11 = 1
                    r0 = r17
                    boolean r3 = kotlin.p549l0.C13265j.m5469v0(r12, r0, r11)
                    if (r3 != 0) goto La8
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchCriteria(r8)
                    r11 = 1
                    java.lang.Object r7 = r2.get(r11)
                    r14 = r7
                    java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                    r12 = r14
                    r11 = 1
                    r0 = r17
                    boolean r3 = kotlin.p549l0.C13265j.m5469v0(r12, r0, r11)
                    if (r3 == 0) goto L5d
                La8:
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r2.add(r8)
                    goto L5d
                Lb6:
                    r0 = r16
                    android.widget.Filter$FilterResults r15 = r0.filterResults
                    r0 = r16
                    ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter<MB> r1 = ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter.this
                    r16 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r15.values = r2
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.adapters.base.BaseMerchantAndBillerSearchAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                BaseMerchantAndBillerSearchAdapter $r3 = BaseMerchantAndBillerSearchAdapter.this;
                List $r4 = $r3.getSearchableList();
                boolean $z0 = $r4.isEmpty();
                if ($z0) {
                    BaseMerchantAndBillerSearchAdapter $r32 = BaseMerchantAndBillerSearchAdapter.this;
                    InterfaceC11756a $r5 = $r32.onNothingFound;
                    if ($r5 == null) {
                        return;
                    }
                    $r5.invoke();
                    return;
                }
                BaseMerchantAndBillerSearchAdapter $r33 = BaseMerchantAndBillerSearchAdapter.this;
                InterfaceC11767l $r6 = $r33.somethingFound;
                if ($r6 != null) {
                    BaseMerchantAndBillerSearchAdapter $r34 = BaseMerchantAndBillerSearchAdapter.this;
                    List $r42 = $r34.getSearchableList();
                    $r6.invoke($r42);
                }
                BaseMerchantAndBillerSearchAdapter $r35 = BaseMerchantAndBillerSearchAdapter.this;
                $r35.notifyDataSetChanged();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.searchableList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Mode getMode() {
        Mode r1 = this.mode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList getOriginalList() {
        ArrayList r1 = this.originalList;
        return r1;
    }

    public abstract List getSearchCriteria(MerchantsOrBillers merchantsOrBillers);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getSearchableList() {
        List r1 = this.searchableList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void search(String str, InterfaceC11767l interfaceC11767l, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11767l, "somethingFound");
        this.onNothingFound = interfaceC11756a;
        this.somethingFound = interfaceC11767l;
        Filter $r3 = getFilter();
        $r3.filter(str);
    }
}
