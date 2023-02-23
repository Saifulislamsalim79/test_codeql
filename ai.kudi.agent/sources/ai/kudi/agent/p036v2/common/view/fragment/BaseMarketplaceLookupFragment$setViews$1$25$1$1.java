package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.merchantProduct.forms.FormInputFieldView;
import ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p043h.p044l.C0819d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11812w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$setViews$1$25$1$1 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$setViews$1$25$1$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ C11812w<ArrayList<String>> $associatedFieldList;
    final /* synthetic */ Field $field;
    final /* synthetic */ FormInputFieldView $inputFieldView;
    final /* synthetic */ C0819d $optionPickerAdapter;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$setViews$1$25$1$1(C0819d c0819d, FormInputFieldView formInputFieldView, C11812w c11812w, BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, Field field) {
        super(0);
        this.$optionPickerAdapter = c0819d;
        this.$inputFieldView = formInputFieldView;
        this.$associatedFieldList = c11812w;
        this.this$0 = baseMarketplaceLookupFragment;
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
        C0819d $r3 = this.$optionPickerAdapter;
        Field $r4 = $r3.getSelectedItem();
        if ($r4 == null) {
            return;
        }
        FormInputFieldView $r5 = this.$inputFieldView;
        C11812w $r6 = this.$associatedFieldList;
        BaseMarketplaceLookupFragment $r1 = this.this$0;
        Field $r2 = this.$field;
        ShortTextInputFieldView $r7 = (ShortTextInputFieldView) $r5;
        String $r8 = $r4.getName();
        $r7.setText($r8);
        boolean $z0 = $r4.getLastField();
        if ($z0) {
            Map $r12 = $r1.mapOfProperties;
            String $r82 = $r2.getKey();
            String $r11 = $r4.getKey();
            String[] $r13 = {$r11};
            $r12.put($r82, $r13);
        } else {
            Object $r9 = $r6.f26499c;
            String $r83 = $r4.getKey();
            ((ArrayList) $r9).add($r83);
            String $r84 = $r2.getKey();
            Object $r92 = $r6.f26499c;
            String $r112 = $r4.getName();
            $r1.handleAssociatedFields($r7, $r4, $r84, (ArrayList) $r92, $r112);
        }
        Map $r122 = $r1.mapOfSummary;
        String $r85 = $r2.getName();
        String $r113 = $r4.getName();
        $r122.put($r85, $r113);
    }
}
