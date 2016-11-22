/*
 * Copyright (c) 2015 Jonas Kalderstam.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nononsenseapps.notepad.ui.common;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.Toast;

import com.nononsenseapps.notepad.R;
import com.nononsenseapps.notepad.data.model.sql.TaskList;
import com.nononsenseapps.notepad.ui.base.DialogConfirmBase;

public class DialogDeleteList extends DialogConfirmBase {
	static final String ID = "id";
<<<<<<< HEAD
<<<<<<< HEAD
	static final String TAG2 = "deletelistok";
	static final String TAG = "RICKSMESSAGE";
	private NavigationDrawerFragment.NavigationDrawerCallbacks mCallbacks;
=======
	static final String TAG = "deletelistok";
	static final String TAG2 = "RICKSMESSAGE";
>>>>>>> Rick-Ammon-Changes
=======
	static final String TAG = "deletelistok";
>>>>>>> parent of 1f2392c... Deletion Redirection

	public static void showDialog(final FragmentManager fm, final long listId, final DialogConfirmedListener listener) {
		DialogDeleteList d = new DialogDeleteList();
		d.setListener(listener);
		Bundle args = new Bundle();
		args.putLong(ID, listId);
		d.setArguments(args);
<<<<<<< HEAD
<<<<<<< HEAD
		d.show(fm, TAG2);
		Log.i(TAG, "Ln#42, DialogDeleteList.DialogDeleteList.showDialog(final FragmentManager fm, final long listId, final DialogConfirmedListener listener)");
=======
		d.show(fm, TAG);
		Log.i(TAG2, "Ln#41, DialogDeleteList.DialogDeleteList.showDialog(final FragmentManager fm, final long listId, final DialogConfirmedListener listener)" +
				"\ncreates new dialogDeleteList instance, creates a listener for it and shows it");
>>>>>>> Rick-Ammon-Changes
=======
		d.show(fm, TAG);
>>>>>>> parent of 1f2392c... Deletion Redirection
	}

	@Override
	public int getTitle() {
		return R.string.delete_question;
	}

	@Override
	public int getMessage() {
		return R.string.delete_list_message;
	}

	@Override
	public void onOKClick() {
		if (getArguments().getLong(ID, -1) > 0) {
			if (0 < getActivity().getContentResolver()
					.delete(TaskList.getUri(getArguments().getLong(ID, -1)),
							null, null)) {
				Toast.makeText(getActivity(), R.string.deleted,
						Toast.LENGTH_SHORT).show();
			}
		}
		if (listener != null) {
			listener.onConfirm();
		}
		getDialog().dismiss();
	}

}
