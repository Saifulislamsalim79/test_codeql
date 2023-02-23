package ai.kudi.agent.p036v2.productSearch.fragment;

import ai.kudi.agent.p036v2.productSearch.adapter.ProductSearchAdapter;
import android.text.TextUtils;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductSearchFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", AttributeType.TEXT, ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.fragment.ProductSearchFragment$onViewCreated$5 */
/* loaded from: classes.dex */
final class ProductSearchFragment$onViewCreated$5 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ ProductSearchFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchFragment$onViewCreated$5(ProductSearchFragment productSearchFragment) {
        super(1);
        this.this$0 = productSearchFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        ProductSearchFragment $r2 = this.this$0;
        String $r3 = $r2.searchTerm;
        boolean $z0 = TextUtils.equals(str, $r3);
        if ($z0) {
            return;
        }
        ProductSearchFragment $r22 = this.this$0;
        ProductSearchAdapter $r4 = $r22.productSearchAdapter;
        $r4.clearData();
        ProductSearchFragment $r23 = this.this$0;
        $r23.searchTerm = str;
        ProductSearchFragment $r24 = this.this$0;
        String $r1 = $r24.searchTerm;
        ProductSearchFragment.search$default($r24, $r1, 0, false, 6, null);
    }
}
