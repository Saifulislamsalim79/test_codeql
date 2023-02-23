package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.databinding.FragmentEditUserProfileBinding;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditUserProfileFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "selectedLga", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.EditUserProfileFragment$showLgas$1$1 */
/* loaded from: classes.dex */
public final class EditUserProfileFragment$showLgas$1$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ StateFragment $statesFragment;
    final /* synthetic */ EditUserProfileFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditUserProfileFragment$showLgas$1$1(EditUserProfileFragment editUserProfileFragment, StateFragment stateFragment) {
        super(1);
        this.this$0 = editUserProfileFragment;
        this.$statesFragment = stateFragment;
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
        Log_OC.getArray(str, "selectedLga");
        EditUserProfileFragment $r3 = this.this$0;
        FragmentEditUserProfileBinding $r1 = $r3._binding;
        if ($r1 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        KudiInputField $r4 = $r1.lgaView;
        if ($r4 != null) {
            $r4.setText(str);
        }
        EditUserProfileFragment $r32 = this.this$0;
        $r32.setLga(str);
        StateFragment $r5 = this.$statesFragment;
        $r5.dismiss();
    }
}
