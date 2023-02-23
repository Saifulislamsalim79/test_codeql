package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p043h.p044l.C0819d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$handleAssociatedFields$2$1$1 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$handleAssociatedFields$2$1$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ ArrayList<String> $associatedFieldList;
    final /* synthetic */ Field $field;
    final /* synthetic */ C0819d $optionPickerAdapter;
    final /* synthetic */ String $parentFieldKey;
    final /* synthetic */ ShortTextInputFieldView $subInputFieldView;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$handleAssociatedFields$2$1$1(C0819d c0819d, ShortTextInputFieldView shortTextInputFieldView, ArrayList arrayList, BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, String str, Field field) {
        super(0);
        this.$optionPickerAdapter = c0819d;
        this.$subInputFieldView = shortTextInputFieldView;
        this.$associatedFieldList = arrayList;
        this.this$0 = baseMarketplaceLookupFragment;
        this.$parentFieldKey = str;
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
        C0819d $r6 = this.$optionPickerAdapter;
        Field $r7 = $r6.getSelectedItem();
        if ($r7 == null) {
            return;
        }
        ShortTextInputFieldView $r3 = this.$subInputFieldView;
        ArrayList $r2 = this.$associatedFieldList;
        BaseMarketplaceLookupFragment $r4 = this.this$0;
        String $r1 = this.$parentFieldKey;
        Field $r5 = this.$field;
        String $r8 = $r7.getName();
        $r3.setText($r8);
        String $r82 = $r7.getKey();
        $r2.add($r82);
        boolean $z0 = $r7.getLastField();
        if ($z0) {
            Map $r9 = $r4.mapOfProperties;
            $r9.put($r1, $r2);
        } else {
            String $r83 = $r7.getName();
            $r4.handleAssociatedFields($r3, $r7, $r1, $r2, $r83);
        }
        Map $r92 = $r4.mapOfSummary;
        String $r12 = $r5.getName();
        String $r84 = $r7.getName();
        $r92.put($r12, $r84);
        $r3.setClickable(false);
    }
}
