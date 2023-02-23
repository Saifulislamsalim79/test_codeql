package ai.kudi.agent.settings.p029ui;

import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: SwitchAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.SwitchAccountFragment$onViewCreated$1$5$1 */
/* loaded from: classes.dex */
final class SwitchAccountFragment$onViewCreated$1$5$1 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ SwitchAccountFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountFragment$onViewCreated$1$5$1(SwitchAccountFragment switchAccountFragment) {
        super(1);
        this.this$0 = switchAccountFragment;
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
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(android.view.View r17) {
        /*
            r16 = this;
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r16
            ai.kudi.agent.settings.ui.SwitchAccountFragment r2 = r0.this$0
            ai.kudi.agent.settings.ui.viewModels.SwitchAccountViewModel r3 = r2.getSwitchAccountViewModel()
            java.util.List r4 = r3.getBusinessCategories()
            r5 = r4
            if (r4 == 0) goto L17
            goto L1b
        L17:
            java.util.List r5 = kotlin.p557z.C13722p.m3941e()
        L1b:
            r0 = r16
            ai.kudi.agent.settings.ui.SwitchAccountFragment r6 = r0.this$0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r5.iterator()
        L28:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r10 = r8.next()
            r12 = r10
            ai.kudi.agent.register.domain.wiki.BusinessCategoryData r12 = (ai.kudi.agent.register.domain.wiki.BusinessCategoryData) r12
            r11 = r12
            java.lang.String r13 = r11.getName()
            r15 = 2131886163(0x7f120053, float:1.9406897E38)
            java.lang.String r14 = r6.getString(r15)
            boolean r9 = kotlin.p483e0.p485d.Log_OC.append(r13, r14)
            r15 = 1
            r9 = r9 ^ r15
            if (r9 == 0) goto L28
            r7.add(r10)
            goto L28
        L4d:
            ai.kudi.agent.settings.p029ui.SwitchAccountFragment.access$showBottomSheet(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.SwitchAccountFragment$onViewCreated$1$5$1.invoke2(android.view.View):void");
    }
}
