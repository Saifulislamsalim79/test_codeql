package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.EditProfileViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.EditUserProfileFragment_MembersInjector */
/* loaded from: classes.dex */
public final class EditUserProfileFragment_MembersInjector implements InterfaceC9463a<EditUserProfileFragment> {
    private final InterfaceC11700a<EditProfileViewModel> editProfileViewModelProvider;

    public EditUserProfileFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.editProfileViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EditUserProfileFragment_MembersInjector $r1 = new EditUserProfileFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectEditProfileViewModel(EditUserProfileFragment editUserProfileFragment, EditProfileViewModel editProfileViewModel) {
        editUserProfileFragment.editProfileViewModel = editProfileViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EditUserProfileFragment editUserProfileFragment) {
        InterfaceC11700a $r3 = this.editProfileViewModelProvider;
        Object $r2 = $r3.get();
        EditProfileViewModel $r4 = (EditProfileViewModel) $r2;
        injectEditProfileViewModel(editUserProfileFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EditUserProfileFragment $r2 = (EditUserProfileFragment) obj;
        injectMembers($r2);
    }
}
