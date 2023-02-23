package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.databinding.ViewRegisterBusinessInfoBinding;
import ai.kudi.agent.register.domain.dto.BusinessCategoryData;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
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
/* compiled from: BusinessInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment$showBottomSheet$1 */
/* loaded from: classes.dex */
public final class BusinessInfoFragment$showBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ List<BusinessCategoryData> $businessCategoryData;
    final /* synthetic */ BusinessInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BusinessInfoFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment$showBottomSheet$1$2 */
    /* loaded from: classes.dex */
    public static final class C04292 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ BusinessInfoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04292(BusinessInfoFragment businessInfoFragment) {
            super(2);
            this.this$0 = businessInfoFragment;
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
            BusinessInfoFragment $r2 = this.this$0;
            InterfaceC8209a $r3 = $r2.requireBinding();
            ViewRegisterBusinessInfoBinding $r4 = (ViewRegisterBusinessInfoBinding) $r3;
            KudiInputField $r5 = $r4.specifyPrimaryBusiness;
            $r5.setText(str);
            BusinessInfoFragment $r22 = this.this$0;
            RegistrationInfo $r6 = $r22.registrationData;
            PersonalInfo $r7 = $r6 == null ? null : $r6.getPersonalInfo();
            if ($r7 != null) {
                $r7.setPrimaryBusinessCategory(str);
            }
            BusinessInfoFragment $r23 = this.this$0;
            $r23.lastSelectedCategory = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoFragment$showBottomSheet$1(List list, BusinessInfoFragment businessInfoFragment) {
        super(1);
        this.$businessCategoryData = list;
        this.this$0 = businessInfoFragment;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x001a */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(ai.kudi.dip.library.bottomSheets.models.C0757a r14) {
        /*
            r13 = this;
            java.lang.String r0 = "$this$$receiver"
            kotlin.p483e0.p485d.Log_OC.getArray(r14, r0)
            java.util.List<ai.kudi.agent.register.domain.dto.BusinessCategoryData> r1 = r13.$businessCategoryData
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L16:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2c
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.register.domain.wiki.BusinessCategoryData r9 = (ai.kudi.agent.register.domain.wiki.BusinessCategoryData) r9
            r8 = r9
            java.lang.String r10 = r8.getName()
            r2.add(r10)
            goto L16
        L2c:
            r14.m38049e(r2)
            ai.kudi.agent.register.ui.BusinessInfoFragment r11 = r13.this$0
            java.lang.String r10 = ai.kudi.agent.register.p021ui.BusinessInfoFragment.access$getLastSelectedCategory$p(r11)
            r14.m38048f(r10)
            ai.kudi.agent.register.ui.BusinessInfoFragment$showBottomSheet$1$2 r12 = new ai.kudi.agent.register.ui.BusinessInfoFragment$showBottomSheet$1$2
            ai.kudi.agent.register.ui.BusinessInfoFragment r11 = r13.this$0
            r12.<init>(r11)
            r14.m38046h(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.BusinessInfoFragment$showBottomSheet$1.invoke2(ai.kudi.dip.library.bottomSheets.models.a):void");
    }
}
