package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.databinding.FragmentEditProfileBinding;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "selectedLga", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.EditProfileFragment$showLgas$1$1 */
/* loaded from: classes.dex */
public final class EditProfileFragment$showLgas$1$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ StateFragment $statesFragment;
    final /* synthetic */ EditProfileFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileFragment$showLgas$1$1(EditProfileFragment editProfileFragment, StateFragment stateFragment) {
        super(1);
        this.this$0 = editProfileFragment;
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
        EditProfileFragment $r3 = this.this$0;
        InterfaceC8209a $r1 = $r3.requireBinding();
        FragmentEditProfileBinding $r4 = (FragmentEditProfileBinding) $r1;
        KudiInputField $r5 = $r4.lgaView;
        if ($r5 != null) {
            $r5.setText(str);
        }
        EditProfileFragment $r32 = this.this$0;
        $r32.setLga(str);
        StateFragment $r6 = this.$statesFragment;
        $r6.dismiss();
    }
}
