package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.databinding.KtaBottomSheetLayoutBinding;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13722p;
/* compiled from: UssdTopUpBottomSheetFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "accountNumberView", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class UssdTopUpBottomSheetFragment$onViewCreated$2$4 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ KtaBottomSheetLayoutBinding $this_apply;
    final /* synthetic */ UssdTopUpBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdTopUpBottomSheetFragment$onViewCreated$2$4(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, KtaBottomSheetLayoutBinding ktaBottomSheetLayoutBinding) {
        super(1);
        this.this$0 = ussdTopUpBottomSheetFragment;
        this.$this_apply = ktaBottomSheetLayoutBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke$lambda-4$lambda-3  reason: not valid java name */
    public static final boolean m41758invoke$lambda4$lambda3(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, MonnifyDetails monnifyDetails, KtaBottomSheetLayoutBinding ktaBottomSheetLayoutBinding, MenuItem menuItem) {
        List $r6;
        MonnifyDetails.AccountData $r11;
        boolean $z0;
        MonnifyDetails.BankData $r14;
        Log_OC.getArray(ussdTopUpBottomSheetFragment, "this$0");
        Log_OC.getArray(monnifyDetails, "$details");
        Log_OC.getArray(ktaBottomSheetLayoutBinding, "$this_apply");
        CharSequence $r4 = menuItem.getTitle();
        Log_OC.loadImage($r4, "item.title");
        String[] $r5 = {"/"};
        $r6 = C13277t.m5383r0($r4, $r5, false, 0, 6, null);
        List $r7 = monnifyDetails.getAccount();
        Iterator $r8 = $r7.iterator();
        while (true) {
            boolean $z02 = $r8.hasNext();
            if (!$z02) {
                $r11 = null;
                break;
            }
            Object $r9 = $r8.next();
            $r11 = $r9;
            MonnifyDetails.AccountData $r112 = (MonnifyDetails.AccountData) $r9;
            boolean $z03 = false;
            Object $r92 = C13722p.m3951U($r6, 0);
            String $r12 = $r112.getAccountNumber();
            boolean $z1 = Log_OC.append($r92, $r12);
            if ($z1) {
                Object $r93 = C13722p.m3951U($r6, 1);
                String $r122 = $r112.getBankName();
                boolean $z12 = Log_OC.append($r93, $r122);
                if ($z12) {
                    $z03 = true;
                    continue;
                } else {
                    continue;
                }
            }
            if ($z03) {
                break;
            }
        }
        ussdTopUpBottomSheetFragment.chosenAccount = $r11;
        ussdTopUpBottomSheetFragment.setAccountText();
        KudiInputField $r13 = ktaBottomSheetLayoutBinding.selectBank;
        String $r123 = $r13.getText();
        $z0 = C13276s.m5440u($r123);
        if (!(!$z0) || ($r14 = ussdTopUpBottomSheetFragment.chosenBankData) == null) {
            return true;
        }
        TextView $r15 = ktaBottomSheetLayoutBinding.ussdCode;
        String $r124 = ussdTopUpBottomSheetFragment.mapMonnifyDetailsToBankData($r14);
        $r15.setText($r124);
        return true;
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
    /* JADX WARN: Incorrect condition in loop: B:7:0x0036 */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(android.view.View r24) {
        /*
            r23 = this;
            java.lang.String r2 = "accountNumberView"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r23
            ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment r3 = r0.this$0
            ai.kudi.agent.wallettopup.data.MonnifyDetails r4 = ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment.access$getMonnifyDetails$p(r3)
            if (r4 != 0) goto L12
            return
        L12:
            r0 = r23
            ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment r3 = r0.this$0
            r0 = r23
            ai.kudi.agent.databinding.KtaBottomSheetLayoutBinding r5 = r0.$this_apply
            android.widget.PopupMenu r6 = new android.widget.PopupMenu
            r7 = r6
            r9 = r3
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            r8 = r9
            android.content.Context r10 = r8.requireContext()
            r0 = r24
            r6.<init>(r10, r0)
            java.util.List r11 = r4.getAccount()
            java.util.Iterator r12 = r11.iterator()
        L32:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L77
            java.lang.Object r14 = r12.next()
            r16 = r14
            ai.kudi.agent.wallettopup.data.MonnifyDetails$AccountData r16 = (ai.kudi.agent.wallettopup.data.MonnifyDetails.AccountData) r16
            r15 = r16
            android.view.Menu r17 = r7.getMenu()
            r19 = 2
            r0 = r19
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r18 = r0
            java.lang.String r20 = r15.getAccountNumber()
            r19 = 0
            r18[r19] = r20
            java.lang.String r20 = r15.getBankName()
            r19 = 1
            r18[r19] = r20
            r21 = r3
            androidx.fragment.app.Fragment r21 = (androidx.fragment.app.Fragment) r21
            r8 = r21
            r19 = 2131886870(0x7f120316, float:1.9408331E38)
            r0 = r19
            r1 = r18
            java.lang.String r20 = r8.getString(r0, r1)
            r0 = r17
            r1 = r20
            r0.add(r1)
            goto L32
        L77:
            ai.kudi.agent.wallettopup.fragments.Main r22 = new ai.kudi.agent.wallettopup.fragments.Main
            r0 = r22
            r0.<init>()
            r0 = r22
            r7.setOnMenuItemClickListener(r0)
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.fragments.UssdTopUpBottomSheetFragment$onViewCreated$2$4.invoke2(android.view.View):void");
    }
}
