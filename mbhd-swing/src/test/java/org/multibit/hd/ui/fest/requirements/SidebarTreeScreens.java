package org.multibit.hd.ui.fest.requirements;

import com.google.common.collect.Maps;
import org.fest.swing.fixture.FrameFixture;
import org.multibit.hd.ui.fest.use_cases.sidebar_screens.*;

import java.util.Map;

/**
 * <p>FEST Swing UI test to provide:</p>
 * <ul>
 * <li>Exercise the sidebar tree to verify the screens show correctly</li>
 * </ul>
 *
 * @since 0.0.1
 *  
 */
public class SidebarTreeScreens {

  public static void verifyUsing(FrameFixture window) {

    Map<String,Object> parameters = Maps.newHashMap();

    new SendRequestScreenUseCase(window).execute(parameters);
    new PaymentsScreenUseCase(window).execute(parameters);
    new ContactsScreenUseCase(window).execute(parameters);
    new HelpScreenUseCase(window).execute(parameters);
    new HistoryScreenUseCase(window).execute(parameters);
    new SettingsScreenUseCase(window).execute(parameters);
    new ToolsScreenUseCase(window).execute(parameters);
    new ExitScreenUseCase(window).execute(parameters);

  }
}