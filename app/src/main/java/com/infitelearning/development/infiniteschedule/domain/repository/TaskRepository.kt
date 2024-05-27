package com.infitelearning.development.infiniteschedule.domain.repository

import com.infitelearning.development.infiniteschedule.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    suspend fun upsertTask(task: Task)

    suspend fun deleteTask(taskId: Int)

    fun getTaskById(taskId: Int): Flow<Task?>

    fun getAllTasks(): Flow<List<Task>>
}