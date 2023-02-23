package ai.kudi.agent.picture_picker.p014ui;

import ai.kudi.agent.picture_picker.presenters.PicturePickerPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.picture_picker.ui.PicturePickerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PicturePickerFragment_MembersInjector implements InterfaceC9463a<PicturePickerFragment> {
    private final InterfaceC11700a<PicturePickerPresenter> screenPresenterProvider;

    public PicturePickerFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.screenPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PicturePickerFragment_MembersInjector $r1 = new PicturePickerFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectScreenPresenter(PicturePickerFragment picturePickerFragment, PicturePickerPresenter picturePickerPresenter) {
        picturePickerFragment.screenPresenter = picturePickerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PicturePickerFragment picturePickerFragment) {
        InterfaceC11700a $r3 = this.screenPresenterProvider;
        Object $r2 = $r3.get();
        PicturePickerPresenter $r4 = (PicturePickerPresenter) $r2;
        injectScreenPresenter(picturePickerFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PicturePickerFragment $r2 = (PicturePickerFragment) obj;
        injectMembers($r2);
    }
}
