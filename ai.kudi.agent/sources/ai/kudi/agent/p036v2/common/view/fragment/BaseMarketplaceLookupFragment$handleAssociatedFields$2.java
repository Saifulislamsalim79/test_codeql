package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.p043h.C0813k;
import ai.kudi.dip.library.p043h.p044l.C0819d;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$handleAssociatedFields$2 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$handleAssociatedFields$2 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ ArrayList<String> $associatedFieldList;
    final /* synthetic */ Field $field;
    final /* synthetic */ String $parentFieldKey;
    final /* synthetic */ ShortTextInputFieldView $subInputFieldView;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$handleAssociatedFields$2(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, Field field, ShortTextInputFieldView shortTextInputFieldView, ArrayList arrayList, String str) {
        super(1);
        this.this$0 = baseMarketplaceLookupFragment;
        this.$field = field;
        this.$subInputFieldView = shortTextInputFieldView;
        this.$associatedFieldList = arrayList;
        this.$parentFieldKey = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        boolean $z0;
        Log_OC.getArray(view, "it");
        Map $r9 = this.this$0.getMapOfAssociatedFields();
        Field $r4 = this.$field;
        int $i0 = $r4.getId();
        String $r3 = String.valueOf($i0);
        Object $r10 = $r9.get($r3);
        List $r11 = (List) $r10;
        if ($r11 == null) {
            return;
        }
        ShortTextInputFieldView $r1 = this.$subInputFieldView;
        BaseMarketplaceLookupFragment $r5 = this.this$0;
        ArrayList $r2 = this.$associatedFieldList;
        String $r32 = this.$parentFieldKey;
        Field $r42 = this.$field;
        boolean $z02 = $r11.isEmpty();
        if (!$z02) {
            String $r12 = $r1.getText();
            $z0 = C13276s.m5440u($r12);
            if ($z0) {
                C0819d r17 = new C0819d();
                r17.setItemList($r11);
                Context $r14 = $r5.requireContext();
                Log_OC.loadImage($r14, "requireContext()");
                BaseMarketplaceLookupFragment$handleAssociatedFields$2$1$1 r18 = new BaseMarketplaceLookupFragment$handleAssociatedFields$2$1$1(r17, $r1, $r2, $r5, $r32, $r42);
                C0813k r19 = new C0813k($r14, r17, r18);
                FragmentManager $r15 = $r5.getChildFragmentManager();
                String $r33 = C0813k.class.getCanonicalName();
                Chapter r20 = (Chapter) r19;
                r20.show($r15, $r33);
            }
        }
    }
}
