package by.agd.todoapp.screens.todolist

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TaskListViewModel : ViewModel() {

    val inputText = MutableLiveData<String>()

    fun addNewTask(view: View) {

    }
}

class TaskListViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TaskListViewModel() as T
    }

}
