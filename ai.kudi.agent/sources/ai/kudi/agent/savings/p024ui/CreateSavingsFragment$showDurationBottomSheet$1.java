package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.databinding.FragmentCreateSavingsBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import ai.kudi.dip.library.edittext.KudiInputField;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateSavingsFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.CreateSavingsFragment$showDurationBottomSheet$1 */
/* loaded from: classes.dex */
public final class CreateSavingsFragment$showDurationBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ List<String> $listData;
    final /* synthetic */ CreateSavingsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CreateSavingsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.CreateSavingsFragment$showDurationBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C04711 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ CreateSavingsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04711(CreateSavingsFragment createSavingsFragment) {
            super(2);
            this.this$0 = createSavingsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            String $r3 = str;
            Integer $r4 = num;
            int $i0 = $r4.intValue();
            invoke($r3, $i0);
            C13666w r5 = C13666w.f30112a;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(String str, int i) {
            Log_OC.getArray(str, TransactionField.STATUS);
            CreateSavingsFragment $r3 = this.this$0;
            InterfaceC8209a $r2 = $r3.requireBinding();
            FragmentCreateSavingsBinding $r4 = (FragmentCreateSavingsBinding) $r2;
            KudiInputField $r5 = $r4.kiDuration;
            $r5.setText(str);
            CreateSavingsFragment $r32 = this.this$0;
            $r32.selectedDuration = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSavingsFragment$showDurationBottomSheet$1(List list, CreateSavingsFragment createSavingsFragment) {
        super(1);
        this.$listData = list;
        this.this$0 = createSavingsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C0757a c0757a) {
        C0757a $r2 = c0757a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C0757a c0757a) {
        Log_OC.getArray(c0757a, "$this$$receiver");
        List $r4 = this.$listData;
        c0757a.m38049e($r4);
        CreateSavingsFragment $r2 = this.this$0;
        String $r3 = $r2.selectedDuration;
        c0757a.m38048f($r3);
        CreateSavingsFragment $r22 = this.this$0;
        C04711 $r5 = new C04711($r22);
        c0757a.m38046h($r5);
    }
}
