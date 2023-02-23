package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.C0767f;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$18 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$setViews$1$18 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ Field $field;
    final /* synthetic */ C0767f $fileUploadButton;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$setViews$1$18(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, C0767f c0767f, Field field) {
        super(0);
        this.this$0 = baseMarketplaceLookupFragment;
        this.$fileUploadButton = c0767f;
        this.$field = field;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BaseMarketplaceLookupFragment $r1 = this.this$0;
        C0767f $r2 = this.$fileUploadButton;
        Field $r3 = this.$field;
        $r1.showDocuments($r2, $r3);
    }
}
