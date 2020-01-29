package by.agd.todoapp.screens.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.agd.todoapp.R
import by.agd.todoapp.databinding.TaskListFragmentBinding

class TaskListFragment : Fragment() {

    private val viewModel: TaskListViewModel by lazy {
        val factory = TaskListViewModelFactory()
        ViewModelProvider(this, factory).get(TaskListViewModel::class.java)
    }

    private lateinit var binding: TaskListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.task_list_fragment, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.viewModel = viewModel
    }


}
