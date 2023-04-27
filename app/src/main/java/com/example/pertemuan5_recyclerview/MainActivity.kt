package com.example.pertemuan5_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pertemuan5_recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listSiswa = arrayListOf(
            Contact("201000", "Bruh", "696969966",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("121211", "yeayyah", "12123455",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("120011", "Hodor", "00000221",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("121277", "Franky", "00192311",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("9999191", "Bruno Venus", "10101010",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("00101221", "Emodoran", "991811",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("00112121", "Karane", "01999211",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D"),
            Contact("00010111", "Hakari", "90909111",
                "https://cdn-useast1.kapwing.com/video_image-PKArdCjxK.png?Expires=1682827204&GoogleAccessId=dev-sa-videoprocessing%40kapwing-dev.iam.gserviceaccount.com&Signature=GSAJoH6KeenWvyplzl6F%2FollKJmJGJXsDIVeSmyvxygoVQky0SfzWqbKOYSsPv23W1r8DzKQp6x3FU5mCO2ifn5gEJw3z0Yxiy7gyLdlEVOeHm4pwocIuEyaSveb1ELWMKtF37zZm%2FiHH7YJ2sSBuziWjVMGN8xSkDNpqO0KKp3oGpN21UtywDsr3n8Xy7DYnYLwjsjPaG64D5O%2B5Y4zm0afRmUXKr9n2R4JoyG6r0tH5FQzr1fcUvaSlpsOKXLTjvXaKK4iPGb6Qk42ldn1KhoxMDJjMS2K5S5pSFjw3%2FaGQW1cIe8uKIsKtshGEbaeXzmqcpgGQp7e2optAZmrjA%3D%3D")
        )

        listView(listSiswa)
    }

    private fun listView(nilai  : ArrayList<Contact>){
        val adapter = ListViewAdapter(this, nilai)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
            false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(nilai  : ArrayList<Contact>){
        val adapter = GridViewAdapter(this, nilai)
        val layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL,
            false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(nilai  : ArrayList<Contact>){
        val adapter = CardViewAdapter(this, nilai)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
            false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}