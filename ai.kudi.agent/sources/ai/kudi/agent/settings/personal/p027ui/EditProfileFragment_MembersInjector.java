package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.EditProfileViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.EditProfileFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EditProfileFragment_MembersInjector implements InterfaceC9463a<EditProfileFragment> {
    private final InterfaceC11700a<EditProfileViewModel> editProfileViewModelProvider;

    public EditProfileFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.editProfileViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EditProfileFragment_MembersInjector $r1 = new EditProfileFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectEditProfileViewModel(EditProfileFragment editProfileFragment, EditProfileViewModel editProfileViewModel) {
        editProfileFragment.editProfileViewModel = editProfileViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EditProfileFragment editProfileFragment) {
        InterfaceC11700a $r3 = this.editProfileViewModelProvider;
        Object $r2 = $r3.get();
        EditProfileViewModel $r4 = (EditProfileViewModel) $r2;
        injectEditProfileViewModel(editProfileFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EditProfileFragment $r2 = (EditProfileFragment) obj;
        injectMembers($r2);
    }
}
