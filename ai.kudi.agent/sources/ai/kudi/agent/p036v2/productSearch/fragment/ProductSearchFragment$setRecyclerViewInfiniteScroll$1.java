package ai.kudi.agent.p036v2.productSearch.fragment;

import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: ProductSearchFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment$setRecyclerViewInfiniteScroll$1 */
/* loaded from: classes.dex */
final class ProductSearchFragment$setRecyclerViewInfiniteScroll$1 extends AbstractC11802m implements InterfaceC11767l<Integer, C13666w> {
    final /* synthetic */ ProductSearchFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchFragment$setRecyclerViewInfiniteScroll$1(ProductSearchFragment productSearchFragment) {
        super(1);
        this.this$0 = productSearchFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Integer num) {
        Integer $r2 = num;
        int $i0 = $r2.intValue();
        invoke($i0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(int i) {
        ProductSearchFragment $r1 = this.this$0;
        String $r2 = $r1.searchTerm;
        $r1.search($r2, i, false);
    }
}
